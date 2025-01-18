package app;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.*;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.mockito.Mockito.*;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        Assert.assertNotNull(tables);
    }

}