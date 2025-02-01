package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = Mockito.spy(new DBApp());
        dbApp.init();
        Mockito.verify(dbApp.getReader(), Mockito.times(1)).readAllTables();
    }

}