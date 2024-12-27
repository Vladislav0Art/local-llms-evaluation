package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;

import sql.SQLTerm;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.getWriter());
    }

}