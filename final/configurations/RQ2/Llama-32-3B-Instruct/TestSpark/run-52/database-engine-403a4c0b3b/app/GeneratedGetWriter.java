package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetWriter {

    @Mock
    private Serializer serializer;

    @Mock
    private CSVWriter csvWriter;

    @Mock
    private CSVRReader csvReader;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void getWriter() {
        CSVWriter result = csvWriter;
        when(serializer.getWriter()).thenReturn(result);
        result.getWriter();
    }

}