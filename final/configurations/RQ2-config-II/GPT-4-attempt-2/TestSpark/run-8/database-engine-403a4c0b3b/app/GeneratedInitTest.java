package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitTest {

    @Mock
    DBApp dbApp;

    @Test
    public void initTest() {
        dbApp.init();
        verify(dbApp, times(1)).init();
    }

}