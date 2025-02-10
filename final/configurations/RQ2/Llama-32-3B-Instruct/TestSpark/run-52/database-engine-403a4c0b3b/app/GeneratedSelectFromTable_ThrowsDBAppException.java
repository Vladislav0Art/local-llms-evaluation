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
public class GeneratedSelectFromTable_ThrowsDBAppException {

    @Mock
    private Serializer serializer;

    @Mock
    private CSVWriter csvWriter;

    @Mock
    private CSVRReader csvReader;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void selectFromTable_ThrowsDBAppException() {
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        DBAppException exception = new DBAppException("test");
        when(serializer.selectFromTable(anyArray(SQLTerm.class), any(String[].class))).thenThrow(exception);
        assertThrows(DBAppException.class, () -> dbApp.SelectFromTable(arrSQLTerms, new String[0]));
    }

}