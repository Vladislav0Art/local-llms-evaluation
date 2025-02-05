package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> myTables = dbApp.getMyTables();

        Assert.assertNotNull(myTables);
    }

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        Object reader = dbApp.getReader();

        Assert.assertNotNull(reader);
    }

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        Object writer = dbApp.getWriter();

        Assert.assertNotNull(writer);
    }

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();

        Assert.assertNotNull(dbApp.getMyTables());
        Assert.assertNotNull(dbApp.getReader());
        Assert.assertNotNull(dbApp.getWriter());
    }

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();

        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("Name", "String");
        htblColNameType.put("Age", "Int");

        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("Age", "0");

        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("Age", "100");

        dbApp.createTable("Persons", "Name", htblColNameType, htblColNameMin, htblColNameMax);

        Assert.assertTrue(dbApp.getMyTables().contains("Persons"));
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp dbApp = Mockito.spy(new DBApp());
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("Name", "John");
        htblColNameValue.put("Age", 30);

        dbApp.insertIntoTable("Persons", htblColNameValue);

        Mockito.verify(dbApp).insertIntoTable(Mockito.anyString(), Mockito.any(Hashtable.class));
    }

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp dbApp = Mockito.spy(new DBApp());
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("Name", "John");
        htblColNameValue.put("Age", 31);

        dbApp.updateTable("Persons", "John", htblColNameValue);

        Mockito.verify(dbApp).updateTable(Mockito.anyString(), Mockito.anyString(), Mockito.any(Hashtable.class));
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = Mockito.spy(new DBApp());
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("Name", "John");

        dbApp.deleteFromTable("Persons", htblColNameValue);

        Mockito.verify(dbApp).deleteFromTable(Mockito.anyString(), Mockito.any(Hashtable.class));
    }

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = {new SQLTerm()};
        String[] strarrOperators = {"And"};

        Object iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);

        Assert.assertNotNull(iterator);
    }

}