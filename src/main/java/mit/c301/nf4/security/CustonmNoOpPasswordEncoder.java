package mit.c301.nf4.security;

import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.extern.log4j.Log4j;

@Log4j
public class CustonmNoOpPasswordEncoder implements PasswordEncoder{
	@Override
	public String encode(CharSequence rawPassword) {
		log.warn("before encode : "+rawPassword);
		return rawPassword.toString();
	}

	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		log.warn("matchers : "+rawPassword + ":" +encodedPassword);
		return rawPassword.toString().equals(encodedPassword);
	}
	
	

}
