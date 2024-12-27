package app;

public class GeneratedGetWriterTest {

    private DBApp dbApp;

    @Test
    public void getWriterTest() {
        // Arrange
        dbApp = new DBApp();

        // Act
        CsvWriter writer = dbApp.getWriter();

        // Assert
        assertNotNull(writer);
    }

}