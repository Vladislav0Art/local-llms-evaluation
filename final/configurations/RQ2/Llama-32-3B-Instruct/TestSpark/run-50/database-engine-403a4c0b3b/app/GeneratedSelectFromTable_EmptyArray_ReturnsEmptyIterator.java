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
public class GeneratedSelectFromTable_EmptyArray_ReturnsEmptyIterator {

    @Mock
    private Serializer serializer;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void selectFromTable_EmptyArray_ReturnsEmptyIterator() throws DBAppException, ParseException {
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];

        when(serializer.readTables()).thenReturn(Arrays.asList("table1", "table2"));
        Iterator iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertFalse(iterator.hasNext());
    }

}