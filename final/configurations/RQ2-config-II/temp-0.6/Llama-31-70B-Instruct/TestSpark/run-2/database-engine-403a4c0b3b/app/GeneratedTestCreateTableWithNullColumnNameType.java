package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTestCreateTableWithNullColumnNameType {

    private DBApp dbApp = new DBApp();

    @Test
    public void testCreateTableWithNullColumnNameType() throws DBAppException {
        dbApp.createTable("tableName", "clusteringKeyColumn", null, new Hashtable<>(), new Hashtable<>());
    }

}