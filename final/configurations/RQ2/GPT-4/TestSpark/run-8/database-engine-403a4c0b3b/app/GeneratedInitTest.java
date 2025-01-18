package app;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.*;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.mockito.Mockito.*;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        Assert.assertTrue(true);
    }

}