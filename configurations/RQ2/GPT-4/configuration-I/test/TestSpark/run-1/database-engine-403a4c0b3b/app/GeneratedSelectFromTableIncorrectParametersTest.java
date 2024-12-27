package app;

import org.junit.Test;

import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

public class GeneratedSelectFromTableIncorrectParametersTest {

    @Test
    public void selectFromTableIncorrectParametersTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] sqlTerms = new SQLTerm[0];
        String[] operators = new String[0];
        Iterator resultSet = dbApp.selectFromTable(sqlTerms, operators);
    }

}