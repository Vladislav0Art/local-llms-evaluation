package app;

import app.DBApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateTableTest {

    @Mock
    private DBApp mockDbApp;

    @Test
    public void createTableTest() {
        try {
            Hashtable<String, String> mockhtblColNameType = new Hashtable<>();
            Hashtable<String, String> mockhtblColNameMin = new Hashtable<>();
            Hashtable<String, String> mockhtblColNameMax = new Hashtable<>();

            // No Exception expected for this test case.
            DBApp dbApp = new DBApp();
            dbApp.createTable("tableName", "primaryKey", mockhtblColNameType, mockhtblColNameMin, mockhtblColNameMax);
        } catch (Exception e) {
            fail("Exception " + e);
        }
    }

}