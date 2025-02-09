package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;

public class GeneratedCreateTableWithDBAppExceptionTest {

    @Test
    public void createTableWithDBAppExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = Mockito.mock(Hashtable.class);
        Mockito.when(htblColNameType.size()).thenReturn(11);
        dbApp.createTable("TestTable", "clusteringKey", htblColNameType, new Hashtable<>(), new Hashtable<>());
    }

}