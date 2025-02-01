package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws Exception {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> nameType = new Hashtable<>();
        Hashtable<String, String> nameMin = new Hashtable<>();
        Hashtable<String, String> nameMax = new Hashtable<>();
        nameType.put("name", "String");
        nameMin.put("name", "a");
        nameMax.put("name", "z");
        dbApp.createTable("table1", "name", nameType, nameMin, nameMax);
    }

}