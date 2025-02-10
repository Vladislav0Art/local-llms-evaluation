package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyNoInteractions;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateTable_InvalidData_ReturnsFalse {

    @Mock
    private Serializer serializer;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void createTable_InvalidData_ReturnsFalse() throws DBAppException, IOException, CsvValidationException {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        when(serializer.readTables()).thenReturn(new ArrayList<>());
        when(serializer.getType(anyString())).thenReturn(null);

        assertFalse(dbApp.createTable("table1", "id", htblColNameType, htblColNameMin, htblColNameMax));
    }

}