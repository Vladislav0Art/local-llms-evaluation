package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;

import sql.SQLTerm;

public class GeneratedCreateTableInvalidTableTest {

    @Test
    public void createTableInvalidTableTest() throws Exception {
        DBApp dbApp = new DBApp();
        dbApp.createTable(null, "Column1", null, null, null);
    }

}