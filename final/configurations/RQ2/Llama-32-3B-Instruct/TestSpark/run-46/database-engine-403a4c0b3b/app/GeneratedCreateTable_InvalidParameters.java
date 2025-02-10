package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateTable_InvalidParameters {

    @Mock
    private Serializer serializer;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void createTable_InvalidParameters() {
        DBAppException exception = assertThrows(DBAppException.class, () -> dbApp.createTable("table1", "column1", null, null, null));
        assertTrue(exception.getMessage().contains("Missing parameters"));
    }

}