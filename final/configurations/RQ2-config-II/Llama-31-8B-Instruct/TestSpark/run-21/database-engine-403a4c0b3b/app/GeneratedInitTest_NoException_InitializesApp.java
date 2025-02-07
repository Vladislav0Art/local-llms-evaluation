package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitTest_NoException_InitializesApp {

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void initTest_NoException_InitializesApp() {
        dbApp.init();
        verify(dbApp, times(1)).init();
    }

}