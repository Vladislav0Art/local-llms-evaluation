package app;

public class GeneratedGetWriter {

    @Test
    public void getWriter() {
        CSVWriter csvWriter = new CSVWriter();
        String[] columnNames = {"Name", "Age"};
        csvWriter.writeRecords(Arrays.asList(columnNames, Arrays.asList("John Doe", "30")));
        when(this.getDBApp().getWriter()).thenReturn(csvWriter);
        assertGetWriter();
    }

}