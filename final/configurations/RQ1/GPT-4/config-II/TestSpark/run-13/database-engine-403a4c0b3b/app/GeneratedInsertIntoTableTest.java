package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp app = new DBApp();
        app.insertIntoTable("Employee", new Hashtable<>());
    }

}