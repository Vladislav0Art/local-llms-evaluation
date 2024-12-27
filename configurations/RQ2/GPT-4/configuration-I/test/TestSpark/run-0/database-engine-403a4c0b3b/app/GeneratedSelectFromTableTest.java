package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;

import sql.SQLTerm;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() {
        try {
            DBApp dbApp = new DBApp();
            SQLTerm[] terms = new SQLTerm[0];
            String[] operators = new String[0];
            Iterator result = dbApp.selectFromTable(terms, operators);
            assertNotNull(result);
        } catch (Exception e) {
            fail("Exception not expected");
        }
    }

}