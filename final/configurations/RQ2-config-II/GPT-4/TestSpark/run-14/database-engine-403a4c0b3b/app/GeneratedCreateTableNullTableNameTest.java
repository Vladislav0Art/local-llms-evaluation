package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedCreateTableNullTableNameTest {

    @Test
    public void createTableNullTableNameTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable(null, "clusterKey", new Hashtable<String, String>(), new Hashtable<String, String>(), new Hashtable<String, String>());
    }

}