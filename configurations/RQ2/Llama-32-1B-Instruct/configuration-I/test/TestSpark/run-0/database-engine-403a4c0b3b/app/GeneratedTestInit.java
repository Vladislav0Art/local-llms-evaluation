package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestInit {

    @Test
    public void testInit() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp);
        assertEquals(0, dbApp.getMyTables().size());
        assertNotNull(dbApp.getCsvReader());
        assertNotNull(dbApp.getCsvWriter());
    }

}