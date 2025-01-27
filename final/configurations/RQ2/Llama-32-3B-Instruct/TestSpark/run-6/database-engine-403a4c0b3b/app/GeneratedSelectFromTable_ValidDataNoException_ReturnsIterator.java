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

public class GeneratedSelectFromTable_ValidDataNoException_ReturnsIterator {

    private final DBApp db = new DBApp();

    @Test
    public void selectFromTable_ValidDataNoException_ReturnsIterator() {
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[]{};
        Iterator iterator = db.selectFromTable(arrSQLTerms, strarrOperators);
        assertTrue(iterator.hasNext());
    }

}