package app;

import static junit.framework.TestCase.fail;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;

import exceptions.DBAppException;
import org.junit.Test;
import util.filecontroller.Serializer;
import util.validation.Validator;
import storage.Table;
import util.TypeCaster;

public class GeneratedCreateTableFailureTest {

    @Test
    public void createTableFailureTest() throws DBAppException {
        String strTableName = "myTable";
        String strClusteringKeyColumn = "key";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        Validator mockedValidator = mock(Validator.class);
        doThrow(DBAppException.class).when(mockedValidator).validateTableCreation(new HashSet<>(), strTableName,
                strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);

        DBApp app = new DBApp(new CsvReader(), new CsvWriter(), mockedValidator);
        try {
            app.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
            fail("Expected exception when creating table");
        } catch (DBAppException e) {
            // pass as exception is expected.
        }
    }

}