package mysqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public final class ConnectionProvider {
static Connection con=null;
private ConnectionProvider() {
	
}
public static Connection getConnection() {
	if(con==null) {
		try {
			Class.forName(DbConnection.DataBase_Driver);
			con=(Connection) DriverManager.getConnection(DbConnection.DataBase_Url,DbConnection.DataBase_User,DbConnection.DataBase_Pass);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	return con;
}
}
