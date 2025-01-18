package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

public class GeneratedGetWriterNotNullTest {

    @Test
    public void getWriterNotNullTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.getWriter());
    }

}