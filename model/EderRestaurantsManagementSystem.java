package model;
import model.items.MenuItem;

public class EderRestaurantsManagementSystem {
    
    private EderRestaurantsDB db;
    
    public EderRestaurantsManagementSystem(){

    }



    public int addNewItem(MenuItem menuItem){
        db = new EderRestaurantsDB();
		int i = db.addNewItem(menuItem);
		db.closings();
		return i;
    }

}
