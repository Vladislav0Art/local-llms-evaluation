package app;

public class GeneratedGetReader_MockCsvReader_ReturnsMockedCsvReader {

    @Test
    public void getReader_MockCsvReader_ReturnsMockedCsvReader() throws Exception {
        CsvReader mockCsvReader = Mockito.mock(CsvReader.class);
        DBApp dbApp = new DBApp();
        CsvReader result = dbApp.getReader();
        expect(mockCsvReader).getIdentity();
        assertSame(result, mockCsvReader);
    }

}