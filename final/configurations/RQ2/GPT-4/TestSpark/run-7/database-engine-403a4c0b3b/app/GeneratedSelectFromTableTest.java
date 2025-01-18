package app;

import org.junit.Test;

import java.util.Hashtable;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.junit.Assert.*;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] sqlTerms = new SQLTerm[1];
        String[] operators = new String[1];
        dbApp.selectFromTable(sqlTerms, operators);
    }

}