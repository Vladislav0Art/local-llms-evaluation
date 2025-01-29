package app;

import app.DBApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class GeneratedTestUpdateTable {

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
    public void testUpdateTable() throws DBAppException {
        String tableName = "test_table";
        Object[] colNameValue = {new Hashtable<String, Object>()};
        dbApp.init();
        Mockito.when(validator.validateTable(tableName)).thenReturn(true);
        dbApp.updateTable(tableName, null, colNameValue);
        verify(dbApp).init();
    }

}