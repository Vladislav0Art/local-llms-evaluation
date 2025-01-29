package app;

public class Generated[MethodUnderTest][UpdateTable]

Test {

    @Test
    public void [MethodUnderTest][UpdateTable]Test() {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");

        db.updateTable("table4", "cluster_key", htblColNameValue);

        assert db.getMyTables().contains("table4");
    }

}