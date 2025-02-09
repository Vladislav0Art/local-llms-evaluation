package app;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("TestCol", "UpdatedValue");
        dbApp.deleteFromTable("TestTable", htblColNameValue);

        // Insert a mock CSV reader that reports the row has been deleted
        CsvReader mockReader = Mockito.mock(CsvReader.class);
        Mockito.when(mockReader.readNext()).thenReturn(null);
        dbApp.setReader(mockReader);

        Iterator results = dbApp.selectFromTable(null, null);
        Assert.assertFalse(results.hasNext());
    }

}