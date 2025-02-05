package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectFromTableTest {

    @Mock
    LinkedHashMap<String, Object> map;

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] terms = {new SQLTerm()};
        String[] operators = {"AND"};
        dbApp.selectFromTable(terms, operators);
    }

}