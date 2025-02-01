package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;

import exceptions.DBAppException;
import storage.Table;
import util.filecontroller.Serializer;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void initTest() {
        CsvReader reader = mock(CsvReader.class);
        DBApp dbApp = new DBApp();
        dbApp.setReader(reader);
        dbApp.init();
        verify(reader).readAllTables();
    }

    @Test
    public void createTableTest() throws DBAppException, IOException {
        String strTableName = "table1";
        String strClusteringKeyColumn = "id";
        Hashtable<String, String> htblColNameType = new Hashtable<String, String>();
        Hashtable<String, String> htblColNameMin = new Hashtable<String, String>();
        Hashtable<String, String> htblColNameMax = new Hashtable<String, String>();

        DBApp dbApp = new DBApp();
        HashSet<String> myTables = new HashSet<String>();
        dbApp.setMyTables(myTables);
        CsvWriter writer = mock(CsvWriter.class);
        dbApp.setWriter(writer);

        dbApp.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
        Assert.assertTrue(dbApp.getMyTables().contains(strTableName));
        verify(writer).write(any(Table.class));
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        String strTableName = "table1";
        Hashtable<String, Object> htblColNameValue = new Hashtable<String, Object>();

        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable(strTableName, htblColNameValue);
    }

    @Test
    public void updateTableTest() throws DBAppException {
        String strTableName = "table1";
        String strClusteringKeyValue = "1";
        Hashtable<String, Object> htblColNameValue = new Hashtable<String, Object>();

        DBApp dbApp = new DBApp();
        dbApp.updateTable(strTableName, strClusteringKeyValue, htblColNameValue);
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        String strTableName = "table1";
        Hashtable<String, Object> htblColNameValue = new Hashtable<String, Object>();

        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable(strTableName, htblColNameValue);
    }

    @Test
    public void selectFromTableTest() throws DBAppException {
        SQLTerm[] arrSQLTerms = new SQLTerm[1];
        arrSQLTerms[0] = new SQLTerm();

        String[] strarrOperators = new String[1];
        strarrOperators[0] = "and";

        DBApp dbApp = new DBApp();
        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}