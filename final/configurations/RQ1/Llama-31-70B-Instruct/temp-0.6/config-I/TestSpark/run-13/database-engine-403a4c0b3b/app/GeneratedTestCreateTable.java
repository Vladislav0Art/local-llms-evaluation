package app;

public class GeneratedTestCreateTable {

    dbApp =new

    DBApp();
}

@Test
public void testCreateTable() throws IOException, ParseException {
    String strTableName = "table1";
    String strClusteringKeyColumn = "column1";
    HashSet<String> expectedTableNames = new HashSet<>();
    expectedTableNames.add(strTableName);

    Mockito.doNothing().when(dbApp.getWriter()).write(Mockito.any(Table.class));
    Mockito.doNothing().when(Serializer.class, "serializeTable", Mockito.any(Table.class));

    dbApp.createTable(strTableName, strClusteringKeyColumn, null, null, null);

    assertEquals(expectedTableNames, dbApp.getMyTables());
}

}