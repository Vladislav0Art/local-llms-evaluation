package app;

public class GeneratedTestGetDatabaseId {

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
    public void testGetDatabaseId() {
        DBAppException exception = new DBAppException();
        try {
            Database database = new Database();
            System.out.println("Expected an exception: " + exception.getMessage());
        } catch (DBAppException e) {
            if (!e.getMessage().equals("No data to query")) {
                throw e;
            }
        }

        Database database = new Database();
        database.setId("1");
        database.setName("test_database");

        System.out.println(database.getId() + " " + database.getName());
    }

}