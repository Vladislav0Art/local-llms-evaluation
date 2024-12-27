package app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Hashtable;
import java.util.Map;

import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

public class GeneratedInit_MocksInitMethodDoesNothing_DoesNotThrowException {

    @Test
    public void init_MocksInitMethodDoesNothing_DoesNotThrowException() {
        Mockito.when(dbApp.init()).thenAnswer(e -> {
        });
        dbApp.init();
    }

}