package app;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("TestCol", "TestValue");
        dbApp.insertIntoTable("TestTable", htblColNameValue);

        // Implementation specific: Insert a mock CSV reader to read the inserted rows
        CsvReader mockReader = Mockito.mock(CsvReader.class);
        Mockito.when(mockReader.readNext()).thenReturn(new String[]{"TestValue"});
        dbApp.setReader(mockReader);

        Iterator results = dbApp.selectFromTable(null, null);
        Assert.assertTrue(results.hasNext());
        Assert.assertEquals("TestValue", results.next());
    }

}