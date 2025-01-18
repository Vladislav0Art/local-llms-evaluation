package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedDBAppConstructorTest {

    @Test
    public void DBAppConstructorTest() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp);
    }

}