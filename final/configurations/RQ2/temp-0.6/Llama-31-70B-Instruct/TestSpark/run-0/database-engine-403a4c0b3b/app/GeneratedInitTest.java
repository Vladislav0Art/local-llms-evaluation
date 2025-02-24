package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import app.DBApp;

import java.util.HashSet;
import java.util.Hashtable;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitTest {

    private DBApp dbApp;

    @Test
    public void initTest() {
        dbApp = new DBApp();
        dbApp.init();
    }

}