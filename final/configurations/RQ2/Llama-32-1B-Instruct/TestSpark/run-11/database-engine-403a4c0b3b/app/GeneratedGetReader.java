package app;

public class GeneratedGetReader {

    @Test
    public void getReader() {
        CSVReader csvReader = new CSVReader();
        String[] columnNames = {"Name", "Age"};
        String[] rowValues = {"John Doe", "30"};
        when(this.getDBApp().getReader()).thenReturn(csvReader);
        assertGetReader();
    }

}