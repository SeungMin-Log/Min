package min.security.handler;

import org.springframework.security.authentication.*;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Service("loginFailHandler")
public class LoginFailHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException exception) throws IOException, ServletException {
        System.out.println("로그인 실패");
        System.out.println(exception instanceof AuthenticationServiceException);
        // TODO Auto-generated method stub
        if(exception instanceof AuthenticationServiceException) {
            httpServletRequest.setAttribute("LoginFailMessage", "죄송합니다. 시스템에 오류가 발생했습니다.");
        }
        else if(exception instanceof BadCredentialsException) {
            httpServletRequest.setAttribute("LoginFailMessage", "아이디 또는 비밀번호가 일치하지 않습니다.");
        }
        else if(exception instanceof DisabledException) {
            httpServletRequest.setAttribute("LoginFailMessage", "현재 사용할 수 없는 계정입니다.");
        }
        else if(exception instanceof LockedException) {
            httpServletRequest.setAttribute("LoginFailMessage", "현재 잠긴 계정입니다.");
        }
        else if(exception instanceof AccountExpiredException) {
            httpServletRequest.setAttribute("LoginFailMessage", "이미 만료된 계정입니다.");
        }
        else if(exception instanceof CredentialsExpiredException) {
            httpServletRequest.setAttribute("LoginFailMessage", "비밀번호가 만료된 계정입니다.");
        }
        else httpServletRequest.setAttribute("LoginFailMessage", "계정을 찾을 수 없습니다.");
        RequestDispatcher dispatcher = httpServletRequest.getRequestDispatcher("/loginPage.do");
        dispatcher.forward(httpServletRequest, httpServletResponse);
    }
}
