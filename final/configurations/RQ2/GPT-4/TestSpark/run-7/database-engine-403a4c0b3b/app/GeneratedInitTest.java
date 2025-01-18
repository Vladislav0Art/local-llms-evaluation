package app;

import org.junit.Test;

import java.util.Hashtable;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.junit.Assert.*;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

}