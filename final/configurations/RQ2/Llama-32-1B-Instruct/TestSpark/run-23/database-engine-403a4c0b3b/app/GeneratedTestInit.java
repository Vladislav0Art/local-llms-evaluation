package app;

public class GeneratedTestInit {

    @Test
    public void testInit() {
        // Arrange
        Set<SqlTerm> expected = new HashSet<>();
        expected.add(new SQLTerm("SELECT", new String[]{"Table1", "Table2"}, null));
        expected.add(new SQLTerm("INSERT INTO Table1 (Column1, Column2)", new Object[]{new HashMap<>()}, new HashMap<>()));
        // MockDBApp.getInit() with an empty set
        when(DBApp.getDbAppInstance().getInit()).thenReturn(expected);

        // Act and Assert
        Set<SqlTerm> actual = DBApp.getDbAppInstance().init();

        assertEquals(expected, actual);
    }

}