package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws Exception {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> nameValues = new Hashtable<>();
        nameValues.put("name", "test");
        nameValues.put("value", 123);
        dbApp.updateTable("table1", "1", nameValues);
    }

}