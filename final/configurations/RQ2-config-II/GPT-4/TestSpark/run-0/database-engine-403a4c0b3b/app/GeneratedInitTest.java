package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitTest {

    @Mock
    LinkedHashMap<String, Object> map;

    @Test
    public void initTest() {
        DBApp dbApp = spy(DBApp.class);
        dbApp.init();
        verify(dbApp).init();
    }

}