package app;

public class Generated[MethodUnderTest][InsertIntoTable]

Test {

    @Test
    public void [MethodUnderTest][InsertIntoTable]Test() {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");

        db.insertIntoTable("table3", htblColNameValue);

        assert db.getMyTables().contains("table3");
    }

}