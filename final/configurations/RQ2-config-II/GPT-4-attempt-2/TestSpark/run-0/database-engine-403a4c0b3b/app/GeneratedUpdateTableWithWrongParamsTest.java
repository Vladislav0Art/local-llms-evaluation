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
public class GeneratedUpdateTableWithWrongParamsTest {

    public static class GetMyTablesTest {

        @Test
        public void updateTableWithWrongParamsTest() throws DBAppException {
            DBApp dbApp = new DBApp();
            Hashtable<String, Object> emptyHashtable = new Hashtable<>();
            dbApp.updateTable("testTable", "testKey", emptyHashtable);
        }
    }

}