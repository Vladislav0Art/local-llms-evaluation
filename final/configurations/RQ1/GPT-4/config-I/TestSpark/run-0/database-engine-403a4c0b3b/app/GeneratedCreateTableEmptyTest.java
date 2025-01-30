package app;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;
import org.junit.Test;

import java.text.ParseException;
import java.util.Hashtable;

public class GeneratedCreateTableEmptyTest {

    @Test
    public void createTableEmptyTest() throws DBAppException {
        DBApp dbapp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbapp.createTable("test", "key", htblColNameType, htblColNameMin, htblColNameMax);
    }

}