package min.security.service.impl;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import min.security.vo.UserVo;

@Mapper("userMapper")
public interface UserMapper {
    UserVo getUserAccount(String s);

}
