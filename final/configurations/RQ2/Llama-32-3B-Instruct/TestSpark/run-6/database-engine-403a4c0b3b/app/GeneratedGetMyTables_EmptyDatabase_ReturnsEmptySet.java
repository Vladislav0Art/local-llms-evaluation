package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;

public class GeneratedGetMyTables_EmptyDatabase_ReturnsEmptySet {

    private final DBApp db = new DBApp();

    @Test
    public void getMyTables_EmptyDatabase_ReturnsEmptySet() {
        HashSet<String> actual = new HashSet<>();
        assertTrue(actual.isEmpty());
    }

}