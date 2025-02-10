package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;

public class GeneratedGetMyTables_ContainsTableNames {

    private DBApp dbApp = new DBApp();
    private final Serializer serializer = new Serializer();
    private final TypeCaster typeCaster = new TypeCaster();

    public void setOut(ByteArrayOutputStream out) {
        System.setOut(new PrintStream(out));
    }

    @Test
    public void getMyTables_ContainsTableNames() {
        ArrayList<String> tableNames = new ArrayList<>();
        tableNames.add("table1");
        tableNames.add("table2");

        Set<String> actual = new HashSet<>(tableNames);

        HashSet<String> expected = new HashSet<>();
        expected.add("table1");
        expected.add("table2");

        assertEquals(expected, actual);
    }

}