package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetReader_ReaderCreated {

    @Mock
    private Serializer serializer;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void testGetReader_ReaderCreated() throws IOException {
        CsvReader csvReader = Mockito.mock(CsvReader.class);
        Mockito.when(serializer.createCsvReader()).thenReturn(csvReader);
        assertEquals(csvReader, dbApp.getReader());
    }

}