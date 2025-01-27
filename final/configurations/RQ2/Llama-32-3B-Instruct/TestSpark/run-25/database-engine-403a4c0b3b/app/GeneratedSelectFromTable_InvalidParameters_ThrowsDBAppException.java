package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class GeneratedSelectFromTable_InvalidParameters_ThrowsDBAppException {

    @Test
    public void selectFromTable_InvalidParameters_ThrowsDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = null;
        String[] strarrOperators = new String[]{"AND"};
        assertThrows(DBAppException.class, () -> dbApp.selectFromTable(arrSQLTerms, strarrOperators));
    }

}