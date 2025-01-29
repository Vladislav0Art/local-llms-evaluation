package app;

public class GeneratedSelectFromTable {

    @Test
    public void selectFromTable() {
        DBApp dbApp = new DBApp();
        String[] strarrOperators = {"= ", ">", "<", ">=", "<="};
        when(this.getDBApp().selectFromTable(sqlTerms)).thenReturn(true);
        assertSelectFromTable(strarrOperators);
    }

    private void assertGetMyTables() {
        assertEquals("Table1", this.getDBApp().getMyTables());
    }

    private void assertGetReader() {
        CSVReader csvReader = new CSVReader();
        String[] columnNames = {"Name", "Age"};
        csvReader.writeRecords(Arrays.asList(columnNames, Arrays.asList("John Doe", "30")));
        assertEquals(csvReader, this.getDBApp().getReader());
    }

    private void assertGetWriter() {
        CSVWriter csvWriter = new CSVWriter();
        String[] columnNames = {"Name", "Age"};
        csvWriter.writeRecords(Arrays.asList(columnNames, Arrays.asList("John Doe", "30")));
        assertEquals(csvWriter, this.getDBApp().getWriter());
    }

    private void assertInit() {
        DBApp dbApp = new DBApp();
        assertEquals(true, dbApp.init("Table1", "ClusteringKey", getHashtableColNameType(), getHashtableColNameMin(), getHashtableColNameMax()));
    }

    private void assertCreateTable() {
        DBApp dbApp = new DBApp();
        assertTrue(dbApp.createTable("Table1", "ClusteringKey", getHashtableColNameType(), getHashtableColNameMin(), getHashtableColNameMax()) == true);
    }

    private void assertInsertIntoTable() {
        DBApp dbApp = new DBApp();
        assertTrue(dbApp.insertIntoTable("Table1", Arrays.asList(Arrays.asList("Name", "Age"))).size() > 0);
    }

    private void assertUpdateTable() {
        DBApp dbApp = new DBApp();
        assertTrue(dbApp.updateTable("Table1", "Key1", getHashtableColNameValue()) == true);
    }

    private void assertDeleteFromTable() {
        DBApp dbApp = new DBApp();
        assertTrue(dbApp.deleteFromTable("Table1", Arrays.asList(Arrays.asList("Name", "Age"))).size() > 0);
    }

    private Hashtable<String, String> getHashtableColNameType() {
        return new Hashtable<>();
    }

    private Hashtable<String, String> getHashtableColNameMin() {
        return new Hashtable<>();
    }

    private Hashtable<String, String> getHashtableColNameMax() {
        return new Hashtable<>();
    }

}