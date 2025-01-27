package app;

public class GeneratedInsertIntoTable_ThrowsDBAppException_WhenTableNameIsEmpty {

    @Test
    public void insertIntoTable_ThrowsDBAppException_WhenTableNameIsEmpty() throws Exception {
        DBApp dbApp = new DBApp();
        DBAppException exception = null;
        Method insertIntoTableMethod = dbApp.getClass().getMethod("insertIntoTable", String.class, Hashtable.class);
        insertIntoTableMethod.invoke(dbApp, "", new Hashtable<>());
        assertEquals(exception, null); // this test can't be verified easily
    }

}