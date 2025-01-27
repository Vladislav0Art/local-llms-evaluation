package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetMyTables_NotEmptySet_ReturnsNotEmptySet {

    @Test
    public void getMyTables_NotEmptySet_ReturnsNotEmptySet() {
        DBApp dbApp = new DBApp();
        HashSet<String> result = new HashSet<>();
        result.add("table1");
        assertEquals(result, dbApp.getMyTables());
    }

}