package app;

public class GeneratedTestGetDatabaseName {

    private String id;
    private String name;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class DBAppException extends Exception {
}

public class SQLTerm {
    private String code;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

public class DatabaseTest {

    @Test
    public void testGetDatabaseName() {
        DBAppException exception = new DBAppException();
        try {
            Database database = new Database();
            System.out.println("Expected an exception: " + exception.getMessage());
        } catch (DBAppException e) {
            if (!e.getMessage().equals("No data to query")) {
                throw e;
            }
        }

        DBAppException exception = new DBAppException();
        try {
            Database database = new Database();
            System.out.println(database.getName() + " " + database.getId());
        } catch (DBAppException e) {
            if (!e.getMessage().equals("No data to query")) {
                throw e;
            }
        }

        DBAppException exception = new DBAppException();
        try {
            Database database = new Database();
            System.out.println(database.getName() + " " + database.getId());
        } catch (DBAppException e) {
            if (!e.getMessage().equals("No data to query")) {
                throw e;
            }
        }

        // No exception should be thrown
    }

}