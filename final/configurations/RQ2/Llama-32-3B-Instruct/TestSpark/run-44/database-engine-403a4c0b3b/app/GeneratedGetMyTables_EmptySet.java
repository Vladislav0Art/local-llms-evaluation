package app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert.*;

public class GeneratedGetMyTables_EmptySet {

    @Test
    public void getMyTables_EmptySet() {
        DBApp dbApp = new DBApp();
        assertTrue(dbApp.getMyTables().isEmpty());
    }

}