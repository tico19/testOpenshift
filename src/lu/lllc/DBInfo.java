package lu.lllc;

public class DBInfo {
	static String host = "mysql2"; // In most cases you will use
													// localhost
	static String DBname = "sampledb";
	static int port = 3306; // This is for MySQL
	static String mySQLdbURL = "jdbc:mysql://" + host + ":" + port + "/"
			+ DBname;

	static String user = "user6JL";
	static String password = "AWA5x6XLAWpkgA1T";
	
	static String driver = "com.mysql.jdbc.Driver";

	public DBInfo() {

	}

	static String getDBURL() {
		return mySQLdbURL;
	}

	public static String getUser() {
		return user;
	}

	public static String getPassword() {
		return password;
	}

	public static String getDriver() {
		return driver;
	}

}
