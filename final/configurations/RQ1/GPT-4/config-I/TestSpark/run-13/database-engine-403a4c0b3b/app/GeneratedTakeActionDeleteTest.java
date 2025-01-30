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

public class GeneratedTakeActionDeleteTest {

    @Test
    public void takeActionDeleteTest() throws DBAppException {
        Validator validator = mock(Validator.class);
        Serializer serializer = mock(Serializer.class);
        Table table = mock(Table.class);
        when(validator.validateTable("myTable", new HashSet<>())).thenReturn(true);
        when(serializer.deserializeTable("myTable")).thenReturn(table);

        DBApp app = new DBApp(new CsvReader(), new CsvWriter(), validator, serializer);
        app.deleteFromTable("myTable", new Hashtable<>());
    }

}