package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    DBApp dbApp;

    @Test
    public void getMyTablesTest() {
        dbApp.getMyTables();
        verify(dbApp, times(1)).getMyTables();
    }

    @Test
    public void getReaderTest() {
        dbApp.getReader();
        verify(dbApp, times(1)).getReader();
    }

    @Test
    public void getWriterTest() {
        dbApp.getWriter();
        verify(dbApp, times(1)).getWriter();
    }

    @Test
    public void initTest() {
        dbApp.init();
        verify(dbApp, times(1)).init();
    }

    @Test
    public void createTableTest() throws DBAppException {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        dbApp.createTable("testTable", "clusteringKey", htblColNameType, htblColNameMin, htblColNameMax);
        verify(dbApp, times(1))
                .createTable("testTable", "clusteringKey", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.insertIntoTable("testTable", htblColNameValue);
        verify(dbApp, times(1)).insertIntoTable("testTable", htblColNameValue);
    }

    @Test
    public void updateTableTest() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.updateTable("testTable", "clusteringKeyValue", htblColNameValue);
        verify(dbApp, times(1)).updateTable("testTable", "clusteringKeyValue", htblColNameValue);
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.deleteFromTable("testTable", htblColNameValue);
        verify(dbApp, times(1)).deleteFromTable("testTable", htblColNameValue);
    }

    @Test
    public void selectFromTableTest() throws DBAppException {
        SQLTerm[] arrSQLTerms = new SQLTerm[5];
        String[] strarrOperators = new String[5];

        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        verify(dbApp, times(1)).selectFromTable(arrSQLTerms, strarrOperators);
    }

}