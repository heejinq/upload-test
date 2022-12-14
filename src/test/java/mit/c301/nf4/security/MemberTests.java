package mit.c301.nf4.security;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml"
	,"file:src/main/webapp/WEB-INF/spring/security-context.xml"
})
@Log4j
public class MemberTests {
	
	@Setter(onMethod_ = @Autowired)
	private PasswordEncoder pwencoder;
	
	@Setter(onMethod_ = @Autowired)
	private DataSource ds;
	
//	@Test
//	public void aaaa() {
//		System.out.println("aaaa");
//	}
	
	@Test //여기는 회원아이디 비번 만둘기
	public void testInterMember() {
		String sql = "insert into tbltest(id,pw,user_name) values(?,?,?)";
		for (int i = 1; i < 11; i++) {
			Connection con = null;
			PreparedStatement pstmt = null;

			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				System.out.println("여기이이이이이이이");
				System.out.println(pwencoder.encode("pw" + i));
						
				pstmt.setString(2, pwencoder.encode("pw" + i));
				if (i < 8) {
					pstmt.setString(1, "user" + i);
					pstmt.setString(3, "일반사용자" + i);
				} else if (i < 9) {
					pstmt.setString(1, "manager" + i);
					pstmt.setString(3, "운영자" + i);
				} else {
					pstmt.setString(1, "admin" + i);
					pstmt.setString(3, "관리자" + i);
				}
				pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (pstmt != null) {
					try {
						pstmt.close();
					} catch (Exception e) {
					}
				}
				if (con != null) {
					try {
						con.close();
					} catch (Exception e) {
					}
				}
			}
		} // end for
	}
	
	@Test
	public void testInterauth() { //여기는 권한탭
		String sql = "insert into auth(id,auth) values(?,?)";
		for (int i = 1; i < 11; i++) {
			Connection con = null;
			PreparedStatement pstmt = null;

			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
						
//				pstmt.setString(2, pwencoder.encode("pw" + i));
				if (i < 8) {
					pstmt.setString(1, "user" + i);
					pstmt.setString(2, "ROLE_USER");
				} else if (i < 9) {
					pstmt.setString(1, "manager" + i);
					pstmt.setString(2, "ROLE_MANAGER");
				} else {
					pstmt.setString(1, "admin" + i);
					pstmt.setString(2, "ROLE_ADMIN");
				}
				pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (pstmt != null) {
					try {
						pstmt.close();
					} catch (Exception e) {
					}
				}
				if (con != null) {
					try {
						con.close();
					} catch (Exception e) {
					}
				}
			}
		} // end for
	}
}


