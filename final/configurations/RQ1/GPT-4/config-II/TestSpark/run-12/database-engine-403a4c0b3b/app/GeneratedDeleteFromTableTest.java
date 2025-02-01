package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws Exception {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> nameValues = new Hashtable<>();
        nameValues.put("name", "test");
        nameValues.put("value", 123);
        dbApp.deleteFromTable("table1", nameValues);
    }

}