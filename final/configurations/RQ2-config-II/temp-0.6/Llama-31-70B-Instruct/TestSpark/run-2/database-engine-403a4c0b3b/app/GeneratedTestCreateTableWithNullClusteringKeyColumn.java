package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTestCreateTableWithNullClusteringKeyColumn {

    private DBApp dbApp = new DBApp();

    @Test
    public void testCreateTableWithNullClusteringKeyColumn() throws DBAppException {
        dbApp.createTable("tableName", null, new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
    }

}