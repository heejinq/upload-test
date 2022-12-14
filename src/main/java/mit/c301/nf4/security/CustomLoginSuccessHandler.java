package mit.c301.nf4.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import lombok.extern.log4j.Log4j;

@Log4j
public class CustomLoginSuccessHandler implements AuthenticationSuccessHandler{
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication auth) throws IOException, ServletException {
	
	log.warn("login success");
	List<String> roleNames=new ArrayList<String>();
	auth.getAuthorities().forEach(authority -> {
		roleNames.add(authority.getAuthority());
	});
		log.warn("ROle names: "+roleNames);
		if(roleNames.contains("ROLE_ADMIN")){
			response.sendRedirect("/login/admin");
			return;
		}if(roleNames.contains("ROLE_MEMBER")){
			response.sendRedirect("/login/member");
			return;
		}
			response.sendRedirect("/");	
	}

}
