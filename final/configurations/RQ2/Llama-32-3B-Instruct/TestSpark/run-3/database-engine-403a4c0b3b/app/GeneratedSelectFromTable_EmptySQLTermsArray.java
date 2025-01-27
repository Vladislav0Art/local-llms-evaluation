package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectFromTable_EmptySQLTermsArray {

    @Mock
    private IDatabase dbInterface;

    public DBApp testDBApp() {
        return new DBApp(dbInterface);
    }

    @Test
    public void selectFromTable_EmptySQLTermsArray() {
        DBApp instance = testDBApp();
        instance.selectFromTable(new SQLTerm[0], new String[]{});
    }

}