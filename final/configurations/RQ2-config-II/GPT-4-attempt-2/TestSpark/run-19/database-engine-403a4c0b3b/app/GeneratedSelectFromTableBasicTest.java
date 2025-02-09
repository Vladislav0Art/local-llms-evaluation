package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.mockito.Mockito.*;

public class GeneratedSelectFromTableBasicTest {

    @Test
    public void selectFromTableBasicTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = {};
        String[] strarrOperators = {};

        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}