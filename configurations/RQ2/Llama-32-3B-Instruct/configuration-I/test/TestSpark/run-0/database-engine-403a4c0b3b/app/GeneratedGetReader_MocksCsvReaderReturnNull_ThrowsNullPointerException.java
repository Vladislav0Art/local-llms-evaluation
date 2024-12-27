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

public class GeneratedGetReader_MocksCsvReaderReturnNull_ThrowsNullPointerException {

    @Test
    public void getReader_MocksCsvReaderReturnNull_ThrowsNullPointerException() {
        when(dbApp.getCsvReader()).thenReturn(null);
        try {
            dbApp.getReader();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}