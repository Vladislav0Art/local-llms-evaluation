package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;

public class GeneratedCreateTableExistentTableNameTest {

    @Test
    public void createTableExistentTableNameTest() throws IOException, DBAppException, ParseException {
        DBApp dbApp = new DBApp();
        String strTableName = "TestTable";
        String strClusteringKeyColumn = "id";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameType.put("id", "java.lang.Integer");
        htblColNameMin.put("id", "1");
        htblColNameMax.put("id", "100");
        dbApp.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
        dbApp.createTable(strTableName, strClusteringKeyColumn,
                htblColNameType, htblColNameMin, htblColNameMax);
    }

}