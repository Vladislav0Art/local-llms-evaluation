package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Hashtable;

import static org.mockito.Mockito.*;

public class GeneratedCreateTableWithInvalidNameTest {

    @Test
    public void createTableWithInvalidNameTest() throws DBAppException, IOException {
        //arrange
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("colName", "String");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("colName", "0");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("colName", "10");
        when(Validator.validateTableCreation(
                any(),
                anyString(),
                anyString(),
                anyMap(),
                anyMap(),
                anyMap()))
                .thenReturn(true);

        //act
        dbApp.createTable(null, "clusteringKey", htblColNameType, htblColNameMin, htblColNameMax);

        //assert
        verify(Validator, times(1)).validateTableCreation(any(), anyString(), anyString(), anyMap(), anyMap(), anyMap());
    }

}