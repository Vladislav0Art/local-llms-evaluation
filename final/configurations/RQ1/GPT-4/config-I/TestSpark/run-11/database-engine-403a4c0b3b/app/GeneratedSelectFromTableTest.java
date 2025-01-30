package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;

import app.DBApp;
import exceptions.DBAppException;
import util.search.SQLTerm;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp app = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[3];
        String[] strarrOperators = new String[1];
        Iterator res = app.selectFromTable(arrSQLTerms, strarrOperators);

        Assert.assertNotNull(res);
    }

    private DBApp mockDBAppWithMockedWriter() {
        CsvWriter writer = Mockito.mock(CsvWriter.class);
        DBApp app = new DBApp();
        app.setWriter(writer);
        return app;
    }

    private DBApp mockDBAppWithMockedReader() {
        CsvReader reader = Mockito.mock(CsvReader.class);
        DBApp app = new DBApp();
        app.setReader(reader);
        HashSet<String> tables = new HashSet<>();
        tables.add("Students");
        Mockito.when(reader.readAllTables()).thenReturn(tables);
        return app;
    }

}