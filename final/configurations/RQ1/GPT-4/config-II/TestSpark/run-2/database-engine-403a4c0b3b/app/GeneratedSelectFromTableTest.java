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

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() {
        DBApp dbApp = new DBApp();
        try {
            dbApp.selectFromTable(new sql.SQLTerm[0], new String[0]);
        } catch (DBAppException e) {
            // expected exception here, do nothing
        }
    }

}