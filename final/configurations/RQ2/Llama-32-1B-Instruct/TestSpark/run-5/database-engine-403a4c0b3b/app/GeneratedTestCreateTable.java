package app;

import app.DBApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class GeneratedTestCreateTable {

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
    public void testCreateTable() throws DBAppException {
        String tableName = "test_table";
        Object[] colNameValue = {new Hashtable<String, Object>()};
        dbApp.init();
        Mockito.when(validator.validateTable(tableName)).thenReturn(true);
        dbApp.createTable(tableName, null, null, null, colNameValue);
        verify(dbApp).init();
    }

}