package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestUpdateTable_InvalidValue {

    @Mock
    private Serializer serializer;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void testUpdateTable_InvalidValue() {
        DBAppException exception = assertThrows(DBAppException.class, () -> dbApp.updateTable("table1", null, null));
        assertTrue(exception.getMessage().contains("Invalid value"));
    }

}