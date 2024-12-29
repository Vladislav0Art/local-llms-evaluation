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
public class GeneratedGetWriterTest_NullWriter_ThrowsNullPointerException {

    @Mock
    private CsvReader csvReader;

    @Mock
    private CsvWriter csvWriter;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void getWriterTest_NullWriter_ThrowsNullPointerException() {
        try {
            dbApp.getWriter();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}