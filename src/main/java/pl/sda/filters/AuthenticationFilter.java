package pl.sda.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = "/Admin.jsp")
public class AuthenticationFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest servletRequest= (HttpServletRequest) req;
        HttpSession httpSession=servletRequest.getSession(false);
        if (httpSession!=null&&httpSession.getAttribute("user")!=null) {
            chain.doFilter(req, resp);
        } else {

           servletRequest.getRequestDispatcher("Login.jsp").forward(req, resp);
        }
    }
    public void init(FilterConfig config) throws ServletException {

    }

}
