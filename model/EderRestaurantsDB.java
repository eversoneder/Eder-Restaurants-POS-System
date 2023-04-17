package model;

import model.items.MenuItem;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EderRestaurantsDB {
    
    private Connection con = null;
	private Statement st = null;

    public int addNewItem(MenuItem menuItem){
        return 0;
    }

    public void closings(){
        try {
			st.close();
			con.close();
		} catch (SQLException ex) {
			Logger.getLogger(EderRestaurantsDB.class.getName()).log(Level.SEVERE, null, ex);
		}
    }
}
