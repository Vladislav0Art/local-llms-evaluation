package app;

public class GeneratedTestGetWriter {

    @Test
    public void testGetWriter() {
        // Arrange
        CSVWriter csvWriterMock = mock(CsvWriter.class);

        // Act
        CSVWriter writer = new DBApp().getWriter();

        // Assert
        verify(csvWriterMock).write();
        assertNotSame(writer, csvWriterMock);
    }

}