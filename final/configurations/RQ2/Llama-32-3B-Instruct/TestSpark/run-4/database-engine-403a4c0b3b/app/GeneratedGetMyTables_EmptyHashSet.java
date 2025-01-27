package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import app.DBApp;
import exceptions.DBAppException;

public class GeneratedGetMyTables_EmptyHashSet {

    @Test
    public void getMyTables_EmptyHashSet() {
        DBApp dbApp = new DBApp();
        HashSet<String> result = dbApp.getMyTables();
        assertEquals(new HashSet<>(), result);
    }

}