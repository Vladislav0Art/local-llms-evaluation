package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp app = new DBApp();
        HashSet<String> tables = app.getMyTables();
        assertNotNull(tables);
    }

}