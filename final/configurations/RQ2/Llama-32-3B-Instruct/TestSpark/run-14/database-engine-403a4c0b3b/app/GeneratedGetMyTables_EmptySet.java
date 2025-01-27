package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.ArrayList;
import java.io.IOException;

public class GeneratedGetMyTables_EmptySet {

    private DBApp dbApp = new DBApp();

    @Test
    public void getMyTables_EmptySet() {
        HashSet<String> result = dbApp.getMyTables();
        assertTrue(result.isEmpty());
    }

}