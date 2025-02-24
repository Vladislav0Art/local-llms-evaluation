package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedInitTest {

    private DBApp dbApp;

    @Test
    public void initTest() throws DBAppException {
        dbApp = new DBApp();
        dbApp.init();
    }

}