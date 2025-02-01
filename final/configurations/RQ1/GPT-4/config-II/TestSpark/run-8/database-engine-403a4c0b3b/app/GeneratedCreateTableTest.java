package app;

import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException, IOException {
        // Setup
        final String strTableName = "testTable";
        final String strClusteringKeyColumn = "testKey";
        final Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("column1", "dataType1");
        final Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("column1", "min1");
        final Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("column1", "max1");

        final CsvWriter writer = Mockito.mock(CsvWriter.class);
        final DBApp dbApp = new DBApp();
        dbApp.setWriter(writer);

        // Execute
        dbApp.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);

        // Verify
        Assert.assertTrue(dbApp.getMyTables().contains(strTableName));
        Mockito.verify(writer).write(Mockito.any(Table.class));
    }

}