package app;

public class GeneratedTest {

    dbApp =new

    DBApp();
}

@Test
public void testInit() throws IOException, ParseException {
    HashSet<String> expectedTableNames = new HashSet<>();
    expectedTableNames.add("table1");
    expectedTableNames.add("table2");

    Mockito.when(dbApp.getReader().readAllTables()).thenReturn(expectedTableNames);

    dbApp.init();

    assertEquals(expectedTableNames, dbApp.getMyTables());
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