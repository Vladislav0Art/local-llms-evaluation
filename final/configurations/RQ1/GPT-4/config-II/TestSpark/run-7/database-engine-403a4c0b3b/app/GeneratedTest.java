package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Hashtable;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void initTest() throws IOException {
        //arrange
        CsvReader reader = mock(CsvReader.class);
        DBApp dbApp = new DBApp();
        dbApp.setReader(reader);

        //act
        dbApp.init();

        //assert
        verify(reader, times(1)).readAllTables();
    }

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

    @Test
    public void insertIntoTableWithInvalidNameTest() throws DBAppException {
        //arrange
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("colName", "String");

        //act
        dbApp.insertIntoTable(null, htblColNameValue);
    }

    @Test
    public void updateTableWithInvalidNameTest() throws DBAppException {
        //arrange
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("colName", "String");

        //act
        dbApp.updateTable(null, "clusteringKeyValue", htblColNameValue);
    }

    @Test
    public void deleteFromTableWithInvalidNameTest() throws DBAppException {
        //arrange
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("colName", "String");

        //act
        dbApp.deleteFromTable(null, htblColNameValue);
    }

}