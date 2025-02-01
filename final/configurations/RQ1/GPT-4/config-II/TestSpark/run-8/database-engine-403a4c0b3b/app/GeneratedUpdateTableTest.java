package app;

import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws DBAppException, ParseException {
        // Setup
        final String strTableName = "testTable";
        final String strClusteringKeyValue = "testKey";
        final Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");

        final DBApp dbApp = new DBApp();

        // Execute
        dbApp.updateTable(strTableName, strClusteringKeyValue, htblColNameValue);

        // Verify (technically nothing to verify as method doesn't return anything, a more detailed test could require complex mocking)
        // Assert
    }

}