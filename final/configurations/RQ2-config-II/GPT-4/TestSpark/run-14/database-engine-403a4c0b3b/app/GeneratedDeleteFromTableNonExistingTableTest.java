package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedDeleteFromTableNonExistingTableTest {

    @Test
    public void deleteFromTableNonExistingTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("NonExistingTable", new Hashtable<String, Object>());
    }

}