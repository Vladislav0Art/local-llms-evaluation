package app;

import app.DBApp;
import org.junit.jupiter.api.Test;

public class GeneratedTestInit {

    @Test
    public void testInit() {
        DBApp dbApp = new DBApp();

        verify(DBApp.getValidator()).init();
        verify(DBApp gettingSerializer()).init();
    }

}