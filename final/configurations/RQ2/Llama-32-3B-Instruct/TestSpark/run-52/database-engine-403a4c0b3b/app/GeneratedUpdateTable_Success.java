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
public class GeneratedUpdateTable_Success {

    @Mock
    private Serializer serializer;

    @Mock
    private CSVWriter csvWriter;

    @Mock
    private CSVRReader csvReader;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void updateTable_Success() {
        String strClusteringKeyValue = "cluster";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        DBAppException exception = null;
        when(serializer.updateTable(anyString(), any(String.class), any(Hashtable.class))).thenReturn(null);
        assertEquals(null, dbApp.UpdateTable("testTable", strClusteringKeyValue, htblColNameValue));
    }

}