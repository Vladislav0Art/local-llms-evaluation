package app;

public class GeneratedTest {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testInit() {
        HashSet<String> expectedTables = new HashSet<>();
        expectedTables.add("table1");
        expectedTables.add("table2");
        when(dbApp.getReader().readAllTables()).thenReturn(expectedTables);

        dbApp.init();

        assertEquals(expectedTables, dbApp.getMyTables());
    }

}