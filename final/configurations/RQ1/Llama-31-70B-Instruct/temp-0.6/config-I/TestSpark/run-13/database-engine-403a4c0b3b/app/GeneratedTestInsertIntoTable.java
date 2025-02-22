package app;

public class GeneratedTestInsertIntoTable {

    dbApp =new

    DBApp();
}

@Test
public void testInsertIntoTable() {
    String strTableName = "table1";
    HashSet<String> expectedTableNames = new HashSet<>();
    expectedTableNames.add(strTableName);

    Mockito.doNothing().when(dbApp.getWriter()).write(Mockito.any(Table.class));
    Mockito.doNothing().when(Serializer.class, "serializeTable", Mockito.any(Table.class));

    dbApp.insertIntoTable(strTableName, null);

    assertEquals(expectedTableNames, dbApp.getMyTables());
}

}