package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito.*;

import java.util.*;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        DBApp dbApp = new DBApp();
        dbApp.updateTable("TestTable", "keyValue", htblColNameValue);
    }

}