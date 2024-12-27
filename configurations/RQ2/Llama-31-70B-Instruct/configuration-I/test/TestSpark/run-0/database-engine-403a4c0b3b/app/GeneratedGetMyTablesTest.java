package app;

public class GeneratedGetMyTablesTest {

    private DBApp dbApp;

    @Test
    public void getMyTablesTest() {
        // Arrange
        dbApp = new DBApp();

        // Act
        HashSet<String> tables = dbApp.getMyTables();

        // Assert
        assertNotNull(tables);
    }

}