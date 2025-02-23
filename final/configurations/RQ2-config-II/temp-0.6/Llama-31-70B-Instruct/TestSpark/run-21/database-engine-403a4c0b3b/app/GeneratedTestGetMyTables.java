package app;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class GeneratedTestGetMyTables {

    DBApp .class
})

public class DBAppTest {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = PowerMockito.spy(new DBApp());
    }

    @Test
    public void testGetMyTables() {
        dbApp.getMyTables();
        Mockito.verify(dbApp, Mockito.times(1)).getMyTables();
    }

}