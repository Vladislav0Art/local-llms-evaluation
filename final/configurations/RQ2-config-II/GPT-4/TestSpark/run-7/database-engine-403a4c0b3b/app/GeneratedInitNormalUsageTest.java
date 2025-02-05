package app;

import app.DBApp;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;

public class GeneratedInitNormalUsageTest {

    // Test the initialization. Assumes the 'init' method has no return.

    @Test
    public void initNormalUsageTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

}