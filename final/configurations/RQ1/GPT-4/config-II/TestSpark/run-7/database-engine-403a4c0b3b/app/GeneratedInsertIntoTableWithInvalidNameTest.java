package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Hashtable;

import static org.mockito.Mockito.*;

public class GeneratedInsertIntoTableWithInvalidNameTest {

    @Test
    public void insertIntoTableWithInvalidNameTest() throws DBAppException {
        //arrange
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("colName", "String");

        //act
        dbApp.insertIntoTable(null, htblColNameValue);
    }

}