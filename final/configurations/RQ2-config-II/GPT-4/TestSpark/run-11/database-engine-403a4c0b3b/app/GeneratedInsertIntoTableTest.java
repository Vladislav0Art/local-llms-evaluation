package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() throws DBAppException {
        String tableName = "TestTable";
        Hashtable<String, Object> data = new Hashtable<>();
        data.put("ID", 1);

        DBApp app = new DBApp();
        app.insertIntoTable(tableName, data);
        // Check if it's added successfully, specific checks can depend on insertIntoTable method implementation
    }

}