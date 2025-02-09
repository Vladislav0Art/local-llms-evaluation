package app;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import sql.SQLTerm;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectFromTableMockTest {

    @Test
    public void selectFromTableMockTest() throws DBAppException {
        DBApp dbAppMock = Mockito.mock(DBApp.class);
        Mockito.when(dbAppMock.selectFromTable(new SQLTerm[]{}, new String[]{})).thenReturn(Mockito.mock(Iterator.class));
        dbAppMock.selectFromTable(new SQLTerm[]{}, new String[]{});
        Mockito.verify(dbAppMock, times(1)).selectFromTable(new SQLTerm[]{}, new String[]{});
    }

}