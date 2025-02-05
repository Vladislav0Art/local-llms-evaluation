package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito.*;

import java.util.*;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable("TestTable", htblColNameValue);
    }

}