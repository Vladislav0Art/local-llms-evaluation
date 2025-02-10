package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedSelectFromTable_ValidQuery {

    private DBApp db = new DBApp();

    @Test
    public void selectFromTable_ValidQuery() throws DBAppException {
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        Iterator iterator = db.selectFromTable(arrSQLTerms, strarrOperators);
        assertTrue(iterator.hasNext());
    }

}