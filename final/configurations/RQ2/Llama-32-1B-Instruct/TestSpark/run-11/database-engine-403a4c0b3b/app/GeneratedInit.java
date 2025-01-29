package app;

public class GeneratedInit {

    @Test
    public void init() {
        DBApp dbApp = new DBApp();
        String[] testStr = {"Table1", "Table2"};
        String strClusteringKeyColumn = "ClusteringKey";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbApp.init(testStr, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
        assertInit();
    }

}