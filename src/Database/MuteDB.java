package Database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MuteDB extends DbConnectionAPI{
	
	public MuteDB(){
		super();
	}
	
	public boolean isAdmin(String username) throws SQLException{
		
		String query = "SELECT rank FROM users WHERE username='"+username+"'";
		ResultSet val = readFromDatabase(query);
		val.next();
		if(val.getInt("rank") ==1|| val.getInt("rank") == 2)
			return true;
		return false;
			
	}
}
