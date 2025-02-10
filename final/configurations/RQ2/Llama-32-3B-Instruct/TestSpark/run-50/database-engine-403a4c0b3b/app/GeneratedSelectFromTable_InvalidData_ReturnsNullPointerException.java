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
public class GeneratedSelectFromTable_InvalidData_ReturnsNullPointerException {

    @Mock
    private Serializer serializer;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void selectFromTable_InvalidData_ReturnsNullPointerException() throws DBAppException, ParseException {
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = null;

        NullPointerException expectedException = new RuntimeException();
        try {
            dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        } catch (RuntimeException e) {
            assertEquals(expectedException, e);
        }
    }

}