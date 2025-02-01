package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;

import exceptions.DBAppException;
import storage.Table;
import util.filecontroller.Serializer;

import static org.mockito.Mockito.*;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        SQLTerm[] arrSQLTerms = new SQLTerm[1];
        arrSQLTerms[0] = new SQLTerm();

        String[] strarrOperators = new String[1];
        strarrOperators[0] = "and";

        DBApp dbApp = new DBApp();
        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}