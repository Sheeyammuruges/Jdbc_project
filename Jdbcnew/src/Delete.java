import java.sql.*;
public class Delete {
	public static void Del() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
		String username = "root";
		String password = "Sheeyam@1450";
		String Query = "delete from con where id='1'";
		Connection conn = DriverManager.getConnection(url, username, password);
		PreparedStatement prep = conn.prepareStatement(Query);
		prep.executeUpdate();
		prep.close();
		
	}
	public static void main(String[] args) throws Exception{
		Del();
	}

}
