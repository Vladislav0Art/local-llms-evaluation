package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedGetMyTables_EmptySet {

    private DBApp db = new DBApp();

    @Test
    public void getMyTables_EmptySet() {
        HashSet<String> set = new HashSet<>();
        db.setMyTables(set);
        assertTrue(db.getMyTables().isEmpty());
    }

}