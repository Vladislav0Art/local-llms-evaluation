package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedInsertIntoTableInvalidTableTest {

    @Test
    public void insertIntoTableInvalidTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable("InvalidTable", new Hashtable<String, Object>());
    }

}