package app;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;
import org.junit.Test;

import java.text.ParseException;
import java.util.Hashtable;

public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        DBApp dbapp = new DBApp();
        assert (dbapp.getReader() != null);
    }

}