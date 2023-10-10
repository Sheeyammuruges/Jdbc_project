
import java.sql.*;
public class New {
	public static void Insertdata() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
		String username = "root";
		String password = "Sheeyam@1450";
		String Query = "insert into con values (?,?)";
		Connection conn = DriverManager.getConnection(url, username, password);
		PreparedStatement prep = conn.prepareStatement(Query);
		prep.setInt(1, 1);
		prep.setString(2,"Sheeyam");
		prep.executeUpdate();
		conn.close();
	}
	
	public static void main(String[] args) throws Exception {
		Insertdata();
	}
}
