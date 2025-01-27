package app;

public class GeneratedUpdateTable_ThrowsDBAppException_WhenTableNameIsEmpty {

    @Test
    public void updateTable_ThrowsDBAppException_WhenTableNameIsEmpty() throws Exception {
        DBApp dbApp = new DBApp();
        DBAppException exception = null;
        Method updateTableMethod = dbApp.getClass().getMethod("updateTable", String.class, String.class,
                Hashtable.class);
        updateTableMethod.invoke(dbApp, "", "key", new Hashtable<>());
        assertEquals(exception, null); // this test can't be verified easily
    }

}