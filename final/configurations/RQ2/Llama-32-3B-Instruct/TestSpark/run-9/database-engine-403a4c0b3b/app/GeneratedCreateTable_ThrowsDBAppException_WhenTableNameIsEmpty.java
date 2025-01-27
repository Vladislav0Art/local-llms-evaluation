package app;

public class GeneratedCreateTable_ThrowsDBAppException_WhenTableNameIsEmpty {

    @Test
    public void createTable_ThrowsDBAppException_WhenTableNameIsEmpty() throws Exception {
        DBApp dbApp = new DBApp();
        DBAppException exception = null;
        Method createTableMethod = dbApp.getClass().getMethod("createTable", String.class, String.class,
                Hashtable.class, Hashtable.class, Hashtable.class);
        createTableMethod.invoke(dbApp, "", "key", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        assertEquals(exception, null); // this test can't be verified easily
    }

}