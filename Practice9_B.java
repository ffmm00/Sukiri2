import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Practice9_B {

	public static ArrayList<Practice9_A>findByMinimumPrice(int i) {

		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = null;

		try {
			con = DriverManager.getConnection("jdbc:derby:rpgdb;create=true");

			PreparedStatement pstmt = con
					.prepareStatement("SELECT*FROM ITEMS WHERE PRICE>?");
			pstmt.setInt(1, i);
			ResultSet rs = pstmt.executeQuery();

			ArrayList<Practice9_A> items = new ArrayList<Practice9_A>();

			while (rs.next()) {
				Practice9_A item = new Practice9_A();
				item.setName(rs.getString("NAME"));
				item.setPrice(rs.getInt("PRICE"));
				item.setWeight(rs.getInt("WEIGHT"));
				items.add(item);
			}

			rs.close();
			pstmt.close();
			return items;


		} catch (SQLException e) {
			e.printStackTrace();
			return null;

		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}


	}
}
