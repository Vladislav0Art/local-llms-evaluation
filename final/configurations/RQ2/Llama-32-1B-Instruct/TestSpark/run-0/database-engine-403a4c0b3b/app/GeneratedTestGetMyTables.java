package app;

public class GeneratedTestGetMyTables {

    private Validator validator;

    @Before
    public void initValidator() {
        validator = new Validator();
    }

    @Test
    public void testGetMyTables() throws DBAppException {
        HashSet<String> tables = getMyTables();
        assertEquals(0, tables.size());
    }

}