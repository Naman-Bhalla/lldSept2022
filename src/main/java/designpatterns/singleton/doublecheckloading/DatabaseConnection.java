package designpatterns.singleton.doublecheckloading;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = null;

    private DatabaseConnection(String name) {}

    // Not going to work in a concurrent environment
    public static DatabaseConnection getInstance(String name) {
        if (databaseConnection == null) {      // T1, T2 // First check without a lock
            synchronized(DatabaseConnection.class) { // T1, T2
                if (databaseConnection == null) { // Second check after a lock
                    databaseConnection = new DatabaseConnection(name); // T1 T2
                }
            }
        }
        return databaseConnection;
    }
}
