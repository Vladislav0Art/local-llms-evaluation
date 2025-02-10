package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedSelectFromTable_InvalidQuery {

    private DBApp db = new DBApp();

    @Test
    public void selectFromTable_InvalidQuery() throws DBAppException {
        throw new DBAppException("test exception");
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        db.selectFromTable(arrSQLTerms, strarrOperators);
    }

}