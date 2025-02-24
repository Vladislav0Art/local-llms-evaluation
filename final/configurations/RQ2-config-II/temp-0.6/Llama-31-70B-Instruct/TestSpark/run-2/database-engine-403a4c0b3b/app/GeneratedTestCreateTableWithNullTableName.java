package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTestCreateTableWithNullTableName {

    private DBApp dbApp = new DBApp();

    @Test
    public void testCreateTableWithNullTableName() throws DBAppException {
        dbApp.createTable(null, "clusteringKeyColumn", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
    }

}