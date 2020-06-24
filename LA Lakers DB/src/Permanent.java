import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Permanent {

	public static void main(String[] args) {
		
		//getConnection(); //MySql과연결
		 //createTable(); //테이블생성
		
		  createPermanent("Wilton Norman Chamberlain","13","C","1968-1973"); //
		  createPermanent("Elgin Gay Baylor","22","SF","1958-1971"); //
		  createPermanent("Kobe Bean Bryant","24","SG","1996-2016"); //
		  createPermanent("Gail Goodrich","25","SG","1965-1978/1970-1976"); //
		  createPermanent("Earvin 'Magic' Johnson Jr.","32","PG","1979-1991/1996"); //
		  createPermanent("Kareem Abdul-Jabbar","33","C","1975-1989"); //
		  createPermanent("Shaquille Rashaun O'Neal, Ed. D.","34","C","1996-2004"); //
		  createPermanent("James Ager Worthy","42","SF","1996-2004"); //
		  createPermanent("Jerry Alan West","44","PG/SG","1960-1974"); //
		  createPermanent("Jamaal Wilkes","52","SF","1977-1985");
		  
		  
		 
	
	}
	

	
	public static String[][] getPermanent(){  
		try {
			Connection conn =  getConnection();
			PreparedStatement statement = conn.prepareStatement("Select Name,RetiredNumber,Position,YearOfEnrollment FROM NBA");
			ResultSet results = statement.executeQuery();
			ArrayList<String[]> list = new ArrayList<String[]>();
			while(results.next()) {
				list.add(new String[] {
						results.getString("Name"),
						results.getString("RetiredNumber"),
						results.getString("Position"),
						results.getString("YearOfEnrollment"),
						
						});
			}
			System.out.println("데이터를 불러왔습니다!");
			String[][] arr = new String[list.size()][4];
			return list.toArray(arr);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
			return null;
		}
	}	
	

	
	public static void createPermanent(String Name,String RetiredNumber,String Position,String YearOfEnrollment) {
		try {
			Connection con = getConnection(); //DB연결 con객체 
			PreparedStatement insert = con.prepareStatement(""
					+ "INSERT INTO Permanent"
					+ "(Name, RetiredNumber, Position, YearOfEnrollment  ) "
					+ "VALUES "
					+ "('"+Name+"','"+RetiredNumber+"','"+Position+"','"+YearOfEnrollment+"')");
			
			insert.executeUpdate(); //데이터 업데이트
			System.out.println("데이터가 저장됬습니다.");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void createTable() {
		try {
			Connection con = getConnection(); //DB연결 conn객체
			PreparedStatement create = con.prepareStatement(
				"CREATE TABLE IF NOT EXISTS " 
				+"nba(RetiredNumber int NOT NULL AUTO_INCREMENT, " 
				+"Name varChar(255), " 
				+"Position varChar(255), " 
				+"YearOfEnrollmentMVP varChar(255) ," 
				+"PRIMARY KEY(RetiredNumber))" );
			create.execute();
			System.out.println("테이블을 만들었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
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

}
  
	
	
	
	
	
	
	

		





