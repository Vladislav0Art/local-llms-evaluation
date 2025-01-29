package app;

import app.DBApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class GeneratedTestDeleteFromTable {

    @InjectMocks
    private DBApp dbApp;

    @Mock
    private Validator validator;

    @Mock
    private Serializer serializer;

    @Mock
    private TypeCaster typeCaster;

    @BeforeEach
    public void setUp() {
        Mockito.reset(validator, serializer, typeCaster);
    }

    @Test
    public void testDeleteFromTable() throws DBAppException {
        String tableName = "test_table";
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        dbApp.init();
        Mockito.when(validator.validateTable(tableName)).thenReturn(true);
        dbApp.deleteFromTable(tableName, colNameValue);
        verify(dbApp).init();
    }

}