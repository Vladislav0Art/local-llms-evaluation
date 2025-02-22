package app;

public class GeneratedTestInit {

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

}