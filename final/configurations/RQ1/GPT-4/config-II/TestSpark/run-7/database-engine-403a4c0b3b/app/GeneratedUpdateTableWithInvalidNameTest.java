package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Hashtable;

import static org.mockito.Mockito.*;

public class GeneratedUpdateTableWithInvalidNameTest {

    @Test
    public void updateTableWithInvalidNameTest() throws DBAppException {
        //arrange
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("colName", "String");

        //act
        dbApp.updateTable(null, "clusteringKeyValue", htblColNameValue);
    }

}