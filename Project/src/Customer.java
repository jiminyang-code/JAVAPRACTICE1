import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Customer {
	public static void main(String[] args) {

		//getConnection();
        createTable();
        //createStudent("무지개","웹크롤링","1234");
        // createCustomer("jk123", "1234", "남성", "123-1234-3378", "중요한 고객입니다.");

	}

	

	public static Connection getConnection() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sampledb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
		String user = "root";
		String pass = "1234";

		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("DB 연결 완료!");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public static void createTable() {
		try {
			Connection conn = getConnection(); // DB연결 conn객체
			PreparedStatement create = conn.prepareStatement(
					"CREATE TABLE IF NOT EXISTS " 
			+ "customer(customer_id int NOT NULL AUTO_INCREMENT,"
		    + "id varChar(255)," 
			+ "pass varChar(255)," 
		    + "gender varChar(255)," 
			+ "phone varChar(255),"
			+ "note varChar(255)," 
			+ "PRIMARY KEY(customer_id))");
			create.execute();
			System.out.println("테이블을 만들었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//	public static void createStudent(String name, String dept, String id) {
//		try {
//			Connection conn = getConnection(); //DB연결 conn객체
//			PreparedStatement insert = conn.prepareStatement(
//					"INSERT INTO student( name, dept, id) "
//					+ "VALUES ('"+name+"','"+dept+"','"+id+"')");
//			insert.execute();
//			System.out.println("저장했습니다.");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		}
//
//}

//public static void update(int row, String name, String pass) {
//try {
//	Connection conn=getConnection(); //db연결
//	PreparedStatement statement=conn.prepareStatement(
//			"UPDATE customer SET"+name+"='"+text+"'
//             FROM customer 
//             WHERE id = ?" );
//			 update.setInt(1,row+1);
//             update.excute();			
//              System.out.println("업데이트 되었슴다.);
//}catch(Exception e) {
//	e.printStackTrace();			
//}	
//}

//public static String[][] getCustomers() {
//try {
//	Connection conn = getConnection(); // db연결
//	PreparedStatement statement = conn.prepareStatement("SELECT * FROM customer");
//	ResultSet results = statement.executeQuery();
//	ArrayList<String[]> list = new ArrayList<String[]>();
//
//	while (results.next()) {
//		list.add(new String[] { results.getString("id"), results.getString("pass"), results.getString("gender"),
//				results.getString("phone"), results.getString("note")
//
//		});
//
//	}
//	System.out.println("검색되었습니다.");
//	String[][] arr = new String[list.size()][5];
//	return list.toArray(arr);
//
//} catch (Exception e) {
//	e.printStackTrace();
//	return null;
//}
//}

//public static void createCustomer(String id, String pass, String gender, String phone, String note) {
//try {
//	Connection conn = getConnection(); // DB연결 conn객체
//	PreparedStatement insert = conn.prepareStatement("INSERT INTO customer(id, pass, gender, phone, note) "
//			+ "VALUES ('" + id + "','" + pass + "','" + gender + "','" + phone + "','" + note + "')");
//	insert.execute();
//	System.out.println("손님이 저장됬습니다.");
//
//} catch (Exception e) {
//	e.printStackTrace();
//}
//}

