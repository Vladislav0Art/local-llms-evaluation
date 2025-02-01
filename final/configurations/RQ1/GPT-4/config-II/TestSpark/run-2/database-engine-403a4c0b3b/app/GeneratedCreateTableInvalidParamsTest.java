package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;
import storage.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.*;

public class GeneratedCreateTableInvalidParamsTest {

    @Test
    public void createTableInvalidParamsTest() {
        CsvWriter writer = Mockito.mock(CsvWriter.class);
        DBApp dbApp = new DBApp();
        dbApp.setWriter(writer);

        try {
            dbApp.createTable(null, null, null, null, null);
        } catch (DBAppException e) {
            // expected exception here, nothing to do
        }
        verify(writer, times(0)).write(any(Table.class));
    }

}