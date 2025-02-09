package app;

import app.DBApp;
import app.IDatabase;
import exceptions.DBAppException;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

import static org.junit.Assert.*;

@RunWith(Enclosed.class)
public class GeneratedGetReaderTest {

    public static class GetMyTablesTest {

        @Test
        public void getReaderTest() {
            DBApp dbApp = new DBApp();
            IDatabase.CsvReader result = dbApp.getReader();
            assertNotNull(result);
        }
    }

}