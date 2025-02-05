package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito.*;

import java.util.*;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("TestTable", htblColNameValue);
    }

}