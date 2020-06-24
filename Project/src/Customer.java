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
        //createStudent("������","��ũ�Ѹ�","1234");
        // createCustomer("jk123", "1234", "����", "123-1234-3378", "�߿��� ���Դϴ�.");

	}

	

	public static Connection getConnection() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sampledb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
		String user = "root";
		String pass = "1234";

		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("DB ���� �Ϸ�!");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public static void createTable() {
		try {
			Connection conn = getConnection(); // DB���� conn��ü
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
			System.out.println("���̺��� ��������ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//	public static void createStudent(String name, String dept, String id) {
//		try {
//			Connection conn = getConnection(); //DB���� conn��ü
//			PreparedStatement insert = conn.prepareStatement(
//					"INSERT INTO student( name, dept, id) "
//					+ "VALUES ('"+name+"','"+dept+"','"+id+"')");
//			insert.execute();
//			System.out.println("�����߽��ϴ�.");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		}
//
//}

//public static void update(int row, String name, String pass) {
//try {
//	Connection conn=getConnection(); //db����
//	PreparedStatement statement=conn.prepareStatement(
//			"UPDATE customer SET"+name+"='"+text+"'
//             FROM customer 
//             WHERE id = ?" );
//			 update.setInt(1,row+1);
//             update.excute();			
//              System.out.println("������Ʈ �Ǿ�����.);
//}catch(Exception e) {
//	e.printStackTrace();			
//}	
//}

//public static String[][] getCustomers() {
//try {
//	Connection conn = getConnection(); // db����
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
//	System.out.println("�˻��Ǿ����ϴ�.");
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
//	Connection conn = getConnection(); // DB���� conn��ü
//	PreparedStatement insert = conn.prepareStatement("INSERT INTO customer(id, pass, gender, phone, note) "
//			+ "VALUES ('" + id + "','" + pass + "','" + gender + "','" + phone + "','" + note + "')");
//	insert.execute();
//	System.out.println("�մ��� �������ϴ�.");
//
//} catch (Exception e) {
//	e.printStackTrace();
//}
//}

