package app;

public class GeneratedGetWriter_MockCsvWriter_ReturnsMockedCsvWriter {

    @Test
    public void getWriter_MockCsvWriter_ReturnsMockedCsvWriter() throws Exception {
        CsvWriter mockCsvWriter = Mockito.mock(CsvWriter.class);
        DBApp dbApp = new DBApp();
        CsvWriter result = dbApp.getWriter();
        expect(mockCsvWriter).getIdentity();
        assertSame(result, mockCsvWriter);
    }

}