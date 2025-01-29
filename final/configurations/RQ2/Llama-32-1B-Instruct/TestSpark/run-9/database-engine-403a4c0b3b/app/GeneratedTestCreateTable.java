package app;

public class GeneratedTestCreateTable {

    @Test
    public void testCreateTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        createTable("my_table", "column1", new Hashtable<String, String>(), null, new Hashtable<String, String>());
        List<SQLTerm> terms = selectFromTable(new SQLTerm[]{"SELECT", "*", "FROM", "my_table"}, new String[]{"OR"});
        Iterator iterator = terms.iterator();
        assertTrue(iterator.hasNext());
    }

}