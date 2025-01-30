package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Hashtable;
import java.util.HashSet;

import sql.SQLTerm;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        String[] arrOperators = {">"};
        SQLTerm[] arrTerms = new SQLTerm[1];
        arrTerms[0] = new SQLTerm("students", "id", "=", "1");

        dbApp.selectFromTable(arrTerms, arrOperators);
    }

}