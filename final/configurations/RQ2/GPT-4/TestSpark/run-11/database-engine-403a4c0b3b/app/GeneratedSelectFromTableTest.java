package app;

import org.junit.Test;
import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        SQLTerm[] terms = new SQLTerm[0];
        String[] operators = new String[0];
        DBApp dbApp = new DBApp();
        Iterator iterator = dbApp.selectFromTable(terms, operators);
    }

}