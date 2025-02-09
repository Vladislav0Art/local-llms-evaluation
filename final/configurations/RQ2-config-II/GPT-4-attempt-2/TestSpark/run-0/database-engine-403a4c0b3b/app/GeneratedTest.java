package app;

import app.DBApp;
import app.IDatabase;
import exceptions.DBAppException;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

import static org.junit.Assert.*;

@RunWith(Enclosed.class)
public class GeneratedTest {

    public static class GetMyTablesTest {

        @Test
        public void getMyTablesTest() {
            DBApp dbApp = new DBApp();
            HashSet<String> result = dbApp.getMyTables();
            assertNotNull(result);
        }
    }

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        IDatabase.CsvReader result = dbApp.getReader();
        assertNotNull(result);
    }
}

@Test
public void getWriterTest() {
    DBApp dbApp = new DBApp();
    IDatabase.CsvWriter result = dbApp.getWriter();
    assertNotNull(result);
}
	}

@Test
public void createTableWithWrongParamsTest() throws DBAppException {
    DBApp dbApp = new DBApp();
    Hashtable<String, String> emptyHashtable = new Hashtable<>();
    dbApp.createTable("testTable", "testKey", emptyHashtable, emptyHashtable, emptyHashtable);
}
	}

@Test
public void insertIntoTableWithWrongParamsTest() throws DBAppException {
    DBApp dbApp = new DBApp();
    Hashtable<String, Object> emptyHashtable = new Hashtable<>();
    dbApp.insertIntoTable("testTable", emptyHashtable);
}
	}

@Test
public void updateTableWithWrongParamsTest() throws DBAppException {
    DBApp dbApp = new DBApp();
    Hashtable<String, Object> emptyHashtable = new Hashtable<>();
    dbApp.updateTable("testTable", "testKey", emptyHashtable);
}
	}

@Test
public void deleteFromTableWithWrongParamsTest() throws DBAppException {
    DBApp dbApp = new DBApp();
    Hashtable<String, Object> emptyHashtable = new Hashtable<>();
    dbApp.deleteFromTable("testTable", emptyHashtable);
}
	}

@Test
public void selectFromTableWithWrongParamsTest() throws DBAppException {
    DBApp dbApp = new DBApp();
    SQLTerm[] emptySQLTerms = new SQLTerm[0];
    String[] emptyStrings = new String[0];
    dbApp.selectFromTable(emptySQLTerms, emptyStrings);
}
	}

@Test
public void initTest() {
    DBApp dbApp = Mockito.spy(DBApp.class);
    dbApp.init();
    Mockito.verify(dbApp, Mockito.times(1)).init();
}
	}

            }