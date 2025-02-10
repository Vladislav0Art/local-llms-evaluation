package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInsertIntoTable_ValidValues {

    @Mock
    private Serializer serializer;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void insertIntoTable_ValidValues() throws ParseException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("value1", 10);
        dbApp.insertIntoTable("table1", htblColNameValue);
    }

}