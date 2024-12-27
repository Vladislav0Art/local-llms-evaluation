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

public class GeneratedGetWriter_MocksCsvWriterReturnNull_ThrowsNullPointerException {

    @Test
    public void getWriter_MocksCsvWriterReturnNull_ThrowsNullPointerException() {
        when(dbApp.getCsvWriter()).thenReturn(null);
        try {
            dbApp.getWriter();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}