package app;

import app.DBApp;
import org.junit.jupiter.api.Test;

public class GeneratedTestSelectFromTable {

    @Test
    public void testSelectFromTable() throws DBAppException {
        String tableName = "testTable";
        HashSet<String> values = new HashSet<>();
        values.add("value1");
        values.add("value2");

        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = {"eq", "neq"};

        dbApp.selectFromTable(arrSQLTerms, strarrOperators);

        verify(DBApp.getValidator()).getDatabaseName();
        verify(DBApp gettingStorage()).selectFromTable(arrSQLTerms, strarrOperators);
    }

}