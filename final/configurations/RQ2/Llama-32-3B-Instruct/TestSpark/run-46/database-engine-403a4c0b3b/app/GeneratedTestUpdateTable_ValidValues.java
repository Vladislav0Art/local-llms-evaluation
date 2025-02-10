package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestUpdateTable_ValidValues {

    @Mock
    private Serializer serializer;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void testUpdateTable_ValidValues() throws ParseException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("value2", 20);
        dbApp.updateTable("table1", "column2", htblColNameValue);
    }

}