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
public class GeneratedInsertIntoTable_ValidData_ReturnsTrue {

    @Mock
    private Serializer serializer;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void insertIntoTable_ValidData_ReturnsTrue() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        assertTrue(dbApp.insertIntoTable("table1", htblColNameValue));
    }

}