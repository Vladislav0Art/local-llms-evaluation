package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedSelectFromTableWithEmptySQLTermsTest {

    @Test
    public void selectFromTableWithEmptySQLTermsTest() throws DBAppException {
        DBApp app = new DBApp();
        app.selectFromTable(new SQLTerm[0], new String[0]);
    }

}