package app;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Test;
import org.mockito.Mockito;
import app.DBApp;
import app.IDatabase;
import exceptions.DBAppException;
import sql.SQLTerm;
import util.filecontroller.Serializer;
import util.search.Search;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();

        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("col1", "int");
        htblColNameType.put("col2", "varchar");

        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("col1", "1");
        htblColNameMin.put("col2", "");

        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("col1", "100");
        htblColNameMax.put("col2", "");

        dbApp.createTable("table1", "col1", htblColNameType, htblColNameMin, htblColNameMax);
        verify(dbApp).createTable("table1", "col1", htblColNameType, htblColNameMin, htblColNameMax);
    }

}