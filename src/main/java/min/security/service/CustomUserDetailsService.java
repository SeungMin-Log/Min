package min.security.service;

import min.security.service.impl.UserMapper;
import min.security.vo.UserVo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        /* ID를 통해서 계정정보를 가져온다 */
        UserVo userVo = userMapper.getUserAccount(s);
        /* 만약 해당아이디의 계정정보가 없으면 실행한다 */
        if (userVo == null){
            throw new UsernameNotFoundException("존재하지 않는 계정입니다");
        }
        return userVo;
    }
}
