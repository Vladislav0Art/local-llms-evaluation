package app;

import org.junit.Test;
import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

}