package app;

public class GeneratedTestSelectFromTable {

    @Test
    public void testSelectFromTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");
        dbApp.insertIntoTable("my_table", htblColNameValue);
        SQLTerm[] terms = selectFromTable(new SQLTerm[]{"SELECT", "*", "FROM", "my_table"}, new String[]{"OR"});
        Iterator iterator = terms.iterator();
        assertTrue(iterator.hasNext());
    }

}