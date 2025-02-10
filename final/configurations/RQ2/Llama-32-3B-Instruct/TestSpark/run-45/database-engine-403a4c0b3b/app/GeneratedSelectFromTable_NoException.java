package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;

public class GeneratedSelectFromTable_NoException {

    private DBApp dbApp = new DBApp();
    private final Serializer serializer = new Serializer();
    private final TypeCaster typeCaster = new TypeCaster();

    public void setOut(ByteArrayOutputStream out) {
        System.setOut(new PrintStream(out));
    }

    @Test
    public void selectFromTable_NoException() throws DBAppException {
        SQLTerm[] arrSQLTerms = new SQLTerm[]{};
        String[] strarrOperators = new String[]{};

        Iterator iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertTrue(iterator.hasNext());
    }

}