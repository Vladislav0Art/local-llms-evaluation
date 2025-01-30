package app;

import static junit.framework.TestCase.fail;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;

import exceptions.DBAppException;
import org.junit.Test;
import util.filecontroller.Serializer;
import util.validation.Validator;
import storage.Table;
import util.TypeCaster;

public class GeneratedInitHappyTest {

    @Test
    public void initHappyTest() {
        CsvReader mockedReader = mock(CsvReader.class);
        when(mockedReader.readAllTables()).thenReturn(new HashSet<>());

        DBApp app = new DBApp(mockedReader, new CsvWriter());
        app.init();
    }

}