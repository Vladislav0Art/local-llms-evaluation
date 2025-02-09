package app;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;
import org.mockito.Mockito;
import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

public class GeneratedUpdateTableInvalidTableTest {

    @Test
    public void updateTableInvalidTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.updateTable("invalidTable", "clusteringKeyValue", htblColNameValue);
    }

}