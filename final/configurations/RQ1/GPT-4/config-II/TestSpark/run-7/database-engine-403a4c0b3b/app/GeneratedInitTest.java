package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Hashtable;

import static org.mockito.Mockito.*;

public class GeneratedInitTest {

    @Test
    public void initTest() throws IOException {
        //arrange
        CsvReader reader = mock(CsvReader.class);
        DBApp dbApp = new DBApp();
        dbApp.setReader(reader);

        //act
        dbApp.init();

        //assert
        verify(reader, times(1)).readAllTables();
    }

}