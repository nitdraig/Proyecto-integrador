package com.portfolioA.A.Draig.Security.jwt;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class JwtEntryPoint implements AuthenticationEntryPoint{
    private final static Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);
@Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException {
        logger.error("fail en el método commence: " + authException.getMessage());

        response.resetBuffer();
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.setHeader("Content-Type", "application/json");
        response.getOutputStream().print("{\"status\":401,\"error\":\"Unauthorized\",\"message\":\"No esta autorizado\"}");
        response.flushBuffer();
    }
    
}