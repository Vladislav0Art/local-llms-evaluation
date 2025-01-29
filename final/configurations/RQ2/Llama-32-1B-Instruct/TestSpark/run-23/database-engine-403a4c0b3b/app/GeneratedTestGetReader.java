package app;

public class GeneratedTestGetReader {

    @Test
    public void testGetReader() {
        // Arrange
        CSVReader csvReaderMock = mock(CsvReader.class);
        when(csvReaderMock.read()).thenReturn(new ArrayList<>());

        // Act
        CSVReader reader = new DBApp().getReader();

        // Assert
        verify(csvReaderMock).read();
        assertNotSame(reader, csvReaderMock);
    }

}