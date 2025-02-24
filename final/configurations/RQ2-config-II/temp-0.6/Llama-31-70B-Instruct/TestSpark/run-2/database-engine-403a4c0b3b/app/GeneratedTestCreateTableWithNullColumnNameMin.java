package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTestCreateTableWithNullColumnNameMin {

    private DBApp dbApp = new DBApp();

    @Test
    public void testCreateTableWithNullColumnNameMin() throws DBAppException {
        dbApp.createTable("tableName", "clusteringKeyColumn", new Hashtable<>(), null, new Hashtable<>());
    }

}