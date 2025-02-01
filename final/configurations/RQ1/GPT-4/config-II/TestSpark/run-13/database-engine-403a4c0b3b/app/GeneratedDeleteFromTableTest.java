package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp app = new DBApp();
        app.deleteFromTable("Employee", new Hashtable<>());
    }

}