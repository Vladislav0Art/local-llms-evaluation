package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedUpdateTableNonExistingTableTest {

    @Test
    public void updateTableNonExistingTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.updateTable("NonExistingTable", "clusterKey", new Hashtable<String, Object>());
    }

}