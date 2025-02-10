package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedGetMyTables_NonEmptySet {

    private DBApp db = new DBApp();

    @Test
    public void getMyTables_NonEmptySet() {
        HashSet<String> set = new HashSet<>();
        set.add("table1");
        set.add("table2");
        db.setMyTables(set);
        assertEquals(2, db.getMyTables().size());
    }

}