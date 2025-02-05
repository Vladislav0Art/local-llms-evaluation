package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        // create a new instance of DBApp class
        DBApp app = new DBApp();

        // testing if the selectFromTable() methods throws an exception when we provide null as arrSQLTerms, strarrOperators
        app.selectFromTable(null, null);
    }

}