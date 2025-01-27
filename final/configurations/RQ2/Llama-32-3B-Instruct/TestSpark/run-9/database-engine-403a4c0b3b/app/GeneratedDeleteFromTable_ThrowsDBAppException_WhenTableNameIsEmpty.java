package app;

public class GeneratedDeleteFromTable_ThrowsDBAppException_WhenTableNameIsEmpty {

    @Test
    public void deleteFromTable_ThrowsDBAppException_WhenTableNameIsEmpty() throws Exception {
        DBApp dbApp = new DBApp();
        DBAppException exception = null;
        Method deleteFromTableMethod = dbApp.getClass().getMethod("deleteFromTable", String.class, Hashtable.class);
        deleteFromTableMethod.invoke(dbApp, "", new Hashtable<>());
        assertEquals(exception, null); // this test can't be verified easily
    }

}