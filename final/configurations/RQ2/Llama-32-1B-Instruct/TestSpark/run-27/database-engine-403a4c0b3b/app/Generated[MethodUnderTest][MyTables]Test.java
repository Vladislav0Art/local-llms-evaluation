package app;

public class Generated[MethodUnderTest][MyTables]

Test {

    @Test
    public void [MethodUnderTest][MyTables]Test() {
        HashSet<String> myTables = new HashSet<>();
        myTables.add("table1");
        myTables.add("table2");

        assert myTables.size() == 2;

        for (String table : myTables) {
            db.getMyTables().add(table);
        }
    }

}