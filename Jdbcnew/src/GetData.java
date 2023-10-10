import java.sql.*;
public class GetData{
	public static void get() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
		String username = "root";
		String password = "Sheeyam@1450";
		String Query = "select * from con";
		Connection conn = DriverManager.getConnection(url, username, password);
		Statement st = conn.createStatement();
		ResultSet rt = st.executeQuery(Query);
		while(rt.next()) {
			System.out.println("id" +rt.getInt(1));
			System.out.println("Name" +rt.getString(2));
		}
	}
	public static void main(String[] args) throws Exception {
		get();
	}

}
