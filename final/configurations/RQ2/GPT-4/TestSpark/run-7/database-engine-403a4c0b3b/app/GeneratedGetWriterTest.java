package app;

import org.junit.Test;

import java.util.Hashtable;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.junit.Assert.*;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.getWriter());
    }

}