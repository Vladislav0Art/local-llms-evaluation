package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;

public class Generated[DBAppCreateTable_NonExistentTableName]

Test {

    @Test
    public void [DBAppCreateTable_NonExistentTableName]Test() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable("nonExistentTable", "clusteringKeyColumn", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
    }

}