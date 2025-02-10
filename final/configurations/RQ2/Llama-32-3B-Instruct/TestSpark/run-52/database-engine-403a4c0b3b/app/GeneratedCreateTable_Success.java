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
public class GeneratedCreateTable_Success {

    @Mock
    private Serializer serializer;

    @Mock
    private CSVWriter csvWriter;

    @Mock
    private CSVRReader csvReader;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void createTable_Success() {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblClusteringKeyColumn = new Hashtable<>();
        htblClusteringKeyColumn.put("cluster", "int");
        when(serializer.createTable(anyString(), any(String.class), any(Hashtable.class), any(Hashtable.class), any(Hashtable.class))).thenReturn(new CsvWriter());
        assertEquals(new CsvWriter(), dbApp.CreateTable("testTable", htblClusteringKeyColumn.get("cluster"), htblColNameType, new Hashtable<>()));
    }

}