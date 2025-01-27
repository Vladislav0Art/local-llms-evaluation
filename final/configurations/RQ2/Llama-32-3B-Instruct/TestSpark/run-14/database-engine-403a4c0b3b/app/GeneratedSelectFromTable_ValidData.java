package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.ArrayList;
import java.io.IOException;

public class GeneratedSelectFromTable_ValidData {

    private DBApp dbApp = new DBApp();

    @Test
    public void selectFromTable_ValidData() throws DBAppException {
        ArrayList<SQLTerm> arrSQLTerms = new ArrayList<>();
        SQLTerm term1 = new SQLTerm("column1", "value4");
        arrSQLTerms.add(term1);
        String[] strarrOperators = new String[0];
        Iterator result = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertTrue(result.hasNext());
    }

}