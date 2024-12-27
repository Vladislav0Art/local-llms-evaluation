package app;

public class GeneratedTest {

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

    @Test
    public void getReaderTest() {
        // Arrange
        dbApp = new DBApp();

        // Act
        CsvReader reader = dbApp.getReader();

        // Assert
        assertNotNull(reader);
    }

    @Test
    public void getWriterTest() {
        // Arrange
        dbApp = new DBApp();

        // Act
        CsvWriter writer = dbApp.getWriter();

        // Assert
        assertNotNull(writer);
    }

    @Test
    public void initTest() {
        // Arrange
        dbApp = new DBApp();

        // Act
        dbApp.init();

        // Assert
        // No assertions needed, as the method is void
    }

}