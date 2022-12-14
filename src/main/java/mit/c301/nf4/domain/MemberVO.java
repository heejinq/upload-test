package mit.c301.nf4.domain;

import java.util.List;


public class MemberVO {//tbltest 테이블
	private String id;
	private String pw;
	private String user_name;
	private boolean enable;
	
	private List<AuthVO> authList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public List<AuthVO> getAuthList() {
		return authList;
	}

	public void setAuthList(List<AuthVO> authList) {
		this.authList = authList;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", user_name=" + user_name + ", enable=" + enable + ", authList="
				+ authList + "]";
	}
	
	

}
