package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp app = new DBApp();
        app.updateTable("Employee", "1", new Hashtable<>());
    }

}