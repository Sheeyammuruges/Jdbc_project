import java.sql.*;
public class Update {
	public static void Upd() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
		String username = "root";
		String password = "Sheeyam@1450";
		String Query = "update con set name='puru' where id='1'";
		Connection conn = DriverManager.getConnection(url, username, password);
		PreparedStatement prep = conn.prepareStatement(Query);
		prep.executeUpdate();
		conn.close();
	}
		public static void main(String[] args) throws Exception{
			Upd();
		
	}

}
