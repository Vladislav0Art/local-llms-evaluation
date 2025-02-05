package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        DBApp app = new DBApp();
        assertNotNull(app.getReader());
    }

}