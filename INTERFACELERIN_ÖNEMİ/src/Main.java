class DatabaseaManeger{
	
	public void AddDatabase(IDatabase database){
		database.add();
	}
	
	public void DeleteDatabase(IDatabase database){
		database.delete();
	}
	
	public void GetDatabase(IDatabase database){
		database.get();
	}
	
	public void UpdateDatabase(IDatabase database){
		database.update();
	}
}


public class Main {
	public static void main(String[] args) {
		DatabaseaManeger maneger = new DatabaseaManeger();
		maneger.AddDatabase(new MysqlDatabase());
		
	}
}
