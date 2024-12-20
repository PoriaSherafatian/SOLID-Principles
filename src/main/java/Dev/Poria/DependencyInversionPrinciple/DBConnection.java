package Dev.Poria.DependencyInversionPrinciple;

public class DBConnection {
    public static void main(String[] args) {
        IDataSource sqlDatabase = new SQLServerDatabase();
        UserService userServiceWithSQL = new UserService(sqlDatabase);
        userServiceWithSQL.performDatabaseOperation();

        IDataSource mySQLDatabase = new MySQLDatabase();
        UserService userServiceWithMySQL = new UserService(mySQLDatabase);
        userServiceWithMySQL.performDatabaseOperation();
    }
}

interface IDataSource {
    void connect();
}

class SQLServerDatabase implements IDataSource {
    @Override
    public void connect() {
        System.out.println("Connected to SQL Server Database.");
    }
}

class MySQLDatabase implements IDataSource {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database.");
    }
}

class UserService {
    private IDataSource database;

    public UserService(IDataSource database) {
        this.database = database;
    }

    public void performDatabaseOperation() {
        database.connect();
        System.out.println("Performing database operations...");
    }
}

