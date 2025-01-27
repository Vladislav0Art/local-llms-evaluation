package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInit_ThrowsException {

    @Mock
    private IDatabase dbInterface;

    public DBApp testDBApp() {
        return new DBApp(dbInterface);
    }

    @Test
    public void init_ThrowsException() {
        testDBApp().init();
    }

}