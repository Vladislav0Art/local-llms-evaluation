package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTestGetMyTables {

    private DBApp dbApp = new DBApp();

    @Test
    public void testGetMyTables() {
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables);
    }

}