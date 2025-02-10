package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;

public class GeneratedSelectFromTable_MultipleScenarios {

    private DBApp dbApp = new DBApp();
    private final Serializer serializer = new Serializer();
    private final TypeCaster typeCaster = new TypeCaster();

    public void setOut(ByteArrayOutputStream out) {
        System.setOut(new PrintStream(out));
    }

    @Test
    public void selectFromTable_MultipleScenarios() throws DBAppException {
        HashSet<String> expected = new HashSet<>();
        expected.add("table1");

        SQLTerm[] arrSQLTerms = new SQLTerm[]{new SQLTerm("test")};
        String[] strarrOperators = new String[]{};

        Iterator iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertEquals(expected, new HashSet<>((Iterator) iterator));
    }

}