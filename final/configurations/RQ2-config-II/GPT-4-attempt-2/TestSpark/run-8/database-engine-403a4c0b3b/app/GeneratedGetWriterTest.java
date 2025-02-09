package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetWriterTest {

    @Mock
    DBApp dbApp;

    @Test
    public void getWriterTest() {
        dbApp.getWriter();
        verify(dbApp, times(1)).getWriter();
    }

}