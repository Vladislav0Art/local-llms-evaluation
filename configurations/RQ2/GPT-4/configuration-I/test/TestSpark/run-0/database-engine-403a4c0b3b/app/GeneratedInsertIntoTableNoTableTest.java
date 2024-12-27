package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;

import sql.SQLTerm;

public class GeneratedInsertIntoTableNoTableTest {

    @Test
    public void insertIntoTableNoTableTest() throws Exception {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> values = new Hashtable<>();
        dbApp.insertIntoTable(null, values);
    }

}