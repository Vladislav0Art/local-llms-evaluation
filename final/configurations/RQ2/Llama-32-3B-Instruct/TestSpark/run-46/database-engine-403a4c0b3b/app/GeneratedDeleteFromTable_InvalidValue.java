package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDeleteFromTable_InvalidValue {

    @Mock
    private Serializer serializer;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void deleteFromTable_InvalidValue() {
        DBAppException exception = assertThrows(DBAppException.class, () -> dbApp.deleteFromTable("table1", null));
        assertTrue(exception.getMessage().contains("Invalid value"));
    }

}