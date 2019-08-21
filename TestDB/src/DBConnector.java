import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	private static String driverName = "com.mysql.jdbc.Driver";
    //JDBCドライバーの名前を変数に代入

	private static String url = "jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";
    //mysql用のurl,?以降は無くても良い

	private static String user = "root";
	//	ログイン準備
	private static String password = "mysql";
	//rootアカウントに対するパスワード
	public Connection getConnection(){
	//接続状態にする
		Connection con=null;
	//状態の初期化、この二行は接続しかしないクラス
		try{
	//try&catchはjavaの例外処理のための構文
			Class.forName(driverName);con=DriverManager.getConnection(url,user,password);
	//ドライバーがロードされ使えるような状態にする
    //tryの中で起きたエラーをcatchが受け取りprintStackTraceで赤い文字で表示してくれる
}catch(ClassNotFoundException e){
    //クラスが見つからない場合の例外
	e.printStackTrace();
}catch(SQLException e){
	//データベース処理に関する例外
	e.printStackTrace();
	}
return con ;
}
}
