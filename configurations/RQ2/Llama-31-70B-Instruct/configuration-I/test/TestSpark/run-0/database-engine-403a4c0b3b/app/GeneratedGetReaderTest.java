package app;

public class GeneratedGetReaderTest {

    private DBApp dbApp;

    @Test
    public void getReaderTest() {
        // Arrange
        dbApp = new DBApp();

        // Act
        CsvReader reader = dbApp.getReader();

        // Assert
        assertNotNull(reader);
    }

}