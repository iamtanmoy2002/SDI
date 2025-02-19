import java.sql.*;

public class UserDAO {
	public static boolean validUser(String email, String password) {
	try {
		Connection conn=DBUtil.getConnection();
		String query = "SELECT * FROM users WHERE email=? AND password=?";
		PreparedStatement ps= conn.prepareStatement(query);
		
		ps.setString(1, email);
		ps.setString(2,password);
		ResultSet rs = ps.executeQuery()
		return rs.next();
	}catch(Exception e){
		e.printStackTrace();
	}
	return false;
}
	public static boolean registerUser(String name, String email, String password) {
		try {
			Connection conn=DBUtil.getConnection();
			String query = "INSERT INTO users(name,email,password) VALUES(?,?,?)";
			PreparedStatement ps= conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3,password);
			return ps.executeUpdate()>0;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
}	
