package app;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestCreateTable_invalidTableName {

    private DBApp dbApp;

    @Before
    public void setup() {
        dbApp = new DBApp();
    }

    @Test
    public void testCreateTable_invalidTableName() {
        try {
            dbApp.createTable("", "key", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
            assertTrue(false);
        } catch (Exception e) {
            assertTrue(true);
        }
    }

}