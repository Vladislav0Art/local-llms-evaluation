package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestSelectFromTable {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testSelectFromTable() {
        dbApp.selectFromTable(null, null);
        assertTrue(dbApp.getMyTables().isEmpty());
    }

}

public class SerializerTest {

    private Serializer serializer;

    @Before
    public void setUp() {
        serializer = new Serializer();
    }

}