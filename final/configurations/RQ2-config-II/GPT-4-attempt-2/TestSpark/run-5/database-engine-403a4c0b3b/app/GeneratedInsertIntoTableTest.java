package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() {
        try {
            DBApp dbApp = new DBApp();
            Hashtable<String, Object> htblColNameValue = new Hashtable<>();
            dbApp.insertIntoTable("test", htblColNameValue);
        } catch (DBAppException e) {
            fail("Exception not expected here");
        }
    }

}