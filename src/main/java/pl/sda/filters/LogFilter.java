package pl.sda.filters;

import pl.sda.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDateTime;

@WebFilter(urlPatterns = "/*")
public class LogFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

      HttpServletRequest servletRequest= (HttpServletRequest) req;
        HttpSession httpSession=servletRequest.getSession(false);
        String username="użytkownik niezalogowany";
        if(httpSession!=null&&httpSession.getAttribute("user")!=null){
            User user=(User)httpSession.getAttribute("user");
           username=user.getUsername();

        }
        System.out.println(LocalDateTime.now()+" "+ username+ servletRequest.getRequestURI());
              chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
