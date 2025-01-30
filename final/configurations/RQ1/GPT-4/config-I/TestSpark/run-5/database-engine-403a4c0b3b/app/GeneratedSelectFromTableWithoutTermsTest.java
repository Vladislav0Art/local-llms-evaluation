package app;

import org.junit.Test;

import java.util.Hashtable;
import java.util.HashSet;

import static org.junit.Assert.*;

import app.DBApp;
import exceptions.DBAppException;

public class GeneratedSelectFromTableWithoutTermsTest {

    @Test
    public void selectFromTableWithoutTermsTest() {
        DBApp dbApp = new DBApp();
        try {
            assertNull(dbApp.selectFromTable(null, null));
        } catch (DBAppException e) {
            e.printStackTrace();
        }
    }

}