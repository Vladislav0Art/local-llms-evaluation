package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() throws Exception {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> nameValues = new Hashtable<>();
        nameValues.put("name", "test");
        nameValues.put("value", 123);
        dbApp.insertIntoTable("table1", nameValues);
    }

}