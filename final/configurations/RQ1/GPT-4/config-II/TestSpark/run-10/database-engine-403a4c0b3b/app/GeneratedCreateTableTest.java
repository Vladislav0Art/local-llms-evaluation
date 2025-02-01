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

public class GeneratedCreateTableTest {

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

}