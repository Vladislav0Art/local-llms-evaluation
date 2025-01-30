package app;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;
import org.junit.Test;

import java.text.ParseException;
import java.util.Hashtable;

public class GeneratedInsertIntoTableEmptyTest {

    @Test
    public void insertIntoTableEmptyTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.insertIntoTable("test", htblColNameValue);
    }

}