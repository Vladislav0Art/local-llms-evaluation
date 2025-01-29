package app;

import app.DBAppException;
import app.IDatabase;
import app.TypeCaster;
import app.sql.SQLTerm;
import app.storage.*;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;

public class GeneratedTestSelectFromTable_NoRows {

    @Test
    public void testSelectFromTable_NoRows() throws IOException {
        IDatabase database = new DBApp();
        String[] arrSQLTerms = new SQLTerm[]{new SQLTerm("SELECT * FROM test_table"), new SQLTerm("WHERE column1 IS NULL")};
        String[] strarrOperators = new String[]{"", "AND"};
        Database.Selecter selector = database.selectFromTable(arrSQLTerms, strarrOperators);
    }

}