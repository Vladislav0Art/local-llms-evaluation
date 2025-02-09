package app;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("TestCol", "UpdatedValue");
        dbApp.updateTable("TestTable", "TestValue", htblColNameValue);

        // Implementation specific: Insert a mock CSV reader to read the updated rows
        CsvReader mockReader = Mockito.mock(CsvReader.class);
        Mockito.when(mockReader.readNext()).thenReturn(new String[]{"UpdatedValue"});
        dbApp.setReader(mockReader);

        Iterator results = dbApp.selectFromTable(null, null);
        Assert.assertTrue(results.hasNext());
        Assert.assertEquals("UpdatedValue", results.next());
    }

}