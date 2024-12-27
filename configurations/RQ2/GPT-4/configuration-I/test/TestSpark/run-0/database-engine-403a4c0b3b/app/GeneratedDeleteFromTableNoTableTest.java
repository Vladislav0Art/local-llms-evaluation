package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;

import sql.SQLTerm;

public class GeneratedDeleteFromTableNoTableTest {

    @Test
    public void deleteFromTableNoTableTest() throws Exception {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> values = new Hashtable<>();
        dbApp.deleteFromTable(null, values);
    }

}