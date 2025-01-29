package app;

import app.DBApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class GeneratedTestSelectFromTable {

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
    public void testSelectFromTable() throws DBAppException {
        SQLTerm[] arrSQLTerms = {new SQLTerm("SELECT * FROM test_table")};
        String[] strarrOperators = {"*"};
        dbApp.init();
        Mockito.when(validator.validateSql(arrSQLTerms)).thenReturn(true);
        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        verify(dbApp).selectFromTable(arrSQLTerms, strarrOperators);
    }

}