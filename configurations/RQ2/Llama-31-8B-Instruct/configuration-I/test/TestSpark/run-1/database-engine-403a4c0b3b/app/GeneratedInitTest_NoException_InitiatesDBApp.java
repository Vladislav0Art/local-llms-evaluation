package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

import org.mockito.Mock;

import static org.mockito.ArgumentMatchers.any;

import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitTest_NoException_InitiatesDBApp {

    private DBApp dbApp;

    @Test
    public void initTest_NoException_InitiatesDBApp() {
        dbApp = new DBApp();
        dbApp.init();
        verify(dbApp, times(1)).init();
    }

}