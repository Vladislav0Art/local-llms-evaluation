package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;
import java.util.HashSet;

import exceptions.DBAppException;
import sql.SQLTerm;

public class GeneratedDBAppConstructorTest {

    @Test
    public void DBAppConstructorTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp);
    }

}