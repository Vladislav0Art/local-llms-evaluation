package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedInitTest {

    private DBApp dbApp;

    @Test
    public void initTest() {
        dbApp = new DBApp();
        dbApp.init();
        assertNotNull(dbApp);
    }

}