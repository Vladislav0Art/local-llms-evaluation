package app;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import app.DBApp;

public class GeneratedInitTest {

    private DBApp dbApp;

    @Test
    public void initTest() throws DBAppException {
        dbApp = new DBApp();
        dbApp.init();
        assertNotNull(dbApp);
    }

}