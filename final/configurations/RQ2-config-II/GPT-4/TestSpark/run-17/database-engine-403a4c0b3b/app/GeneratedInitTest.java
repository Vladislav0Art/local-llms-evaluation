package app;

import org.junit.Test;

import static org.junit.Assert.*;

import exceptions.DBAppException;

import java.util.Hashtable;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        try {
            DBApp dbApp = new DBApp();
            dbApp.init();
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }

}