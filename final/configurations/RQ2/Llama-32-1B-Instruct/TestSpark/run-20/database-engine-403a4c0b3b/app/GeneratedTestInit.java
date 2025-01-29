package app;

import app.DBApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestInit {

    @Test
    public void testInit() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.init());
    }

}