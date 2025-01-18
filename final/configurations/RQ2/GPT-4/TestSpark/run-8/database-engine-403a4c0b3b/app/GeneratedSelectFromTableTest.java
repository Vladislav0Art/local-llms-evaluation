package app;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.*;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.mockito.Mockito.*;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = spy(new DBApp());
        SQLTerm[] sqlTerms = new SQLTerm[0];
        String[] operators = new String[0];

        dbApp.selectFromTable(sqlTerms, operators);
        Mockito.verify(dbApp, atLeastOnce()).selectFromTable(any(SQLTerm[].class), any(String[].class));
    }

}