package app;

public class GeneratedCreateTable_CreateTableWithColumns {

    @Test
    public void createTable_CreateTableWithColumns() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("name", "String");
        Hashtable<String, String> htblClusteringKeyColumn = new Hashtable<>();
        htblClusteringKeyColumn.put("id", "Integer");
        dbApp.createTable("myTable", "id", htblClNameType, htblClusteringKeyColumn);
    }

}