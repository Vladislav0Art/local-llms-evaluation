package app;

public class Generated[MethodUnderTest][DeleteFromTable]

Test {

    @Test
    public void [MethodUnderTest][DeleteFromTable]Test() {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");

        db.deleteFromTable("table5", htblColNameValue);

        assert !db.getMyTables().contains("table5");
    }

}