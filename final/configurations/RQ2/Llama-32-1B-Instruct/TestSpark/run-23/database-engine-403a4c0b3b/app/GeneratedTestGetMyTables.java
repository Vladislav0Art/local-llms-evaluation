package app;

public class GeneratedTestGetMyTables {

    @Test
    public void testGetMyTables() {
        // Arrange
        HashSet<String> expected = new HashSet<>();
        expected.add("Table1");
        expected.add("Table2");

        // Act
        HashSet<String> actual = DBApp.getMyTables();

        // Assert
        assertEquals(expected, actual);
    }

}