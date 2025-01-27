package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class GeneratedGetMyTables returnsAnEmptyHashSet {

    @Test
    public void getMyTables

    returnsAnEmptyHashSet() {
        DBApp dbApp = new DBApp();
        HashSet<String> result = dbApp.getMyTables();
        assertTrue(result.isEmpty());
    }

}