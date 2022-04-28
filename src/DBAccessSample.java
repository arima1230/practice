import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAccessSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/neo";
		String id = "root";
		String pw =  "";
		Connection connection = null;
		
		try {
			//ＪＤＢＣドライバの登録
			Class.forName(driver);
			//テータベースへの接続
			connection = DriverManager.getConnection(url,id,pw);
			//接続成功
			System.out.println("接続に成功しました。");
		}catch(ClassNotFoundException e){
			System.out.println("接続失敗:JDBCドライバが見つかりません。");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("接続ができませんでした。");
			e.printStackTrace();
		}
	}

}
