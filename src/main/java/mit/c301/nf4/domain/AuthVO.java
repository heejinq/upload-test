package mit.c301.nf4.domain;

public class AuthVO { //auth 테이블
	@Override
	public String toString() {
		return "AuthVO [id=" + id + ", auth=" + auth + "]";
	}
	private String id;
	private String auth;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	
	

	
	
	

}
