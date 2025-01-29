package app;

public class GeneratedTest {

    @Test
    public void [MethodUnderTest][MyTables]

    Test() {
        HashSet<String> myTables = new HashSet<>();
        myTables.add("table1");
        myTables.add("table2");

        assert myTables.size() == 2;

        for (String table : myTables) {
            db.getMyTables().add(table);
        }
    }

    @Test
    public void [MethodUnderTest][GetReader]

    Test() {
        String[] sqlTerms = {"SELECT * FROM table1", "SELECT * FROM table2"};
        SQLTerm[] arrSQLTerms = new SQLTerm[sqlTerms.length];
        for (int i = 0; i < sqlTerms.length; i++) {
            arrSQLTerms[i] = new SQLTerm(sqlTerms[i]);
        }

        CsvReader csvReader = new CsvReader();
        try {
            csvReader.init();
            Iterator<CSVRow> rows = csvReader.getRows(arrSQLTerms);
            for (CSVRow row : rows) {
                assertNotNull(row);
            }
        } catch (DBAppException e) {
            fail("Expected DBAppException");
        }
    }

    @Test
    public void [MethodUnderTest][GetWriter]

    Test() {
        String[] sqlTerms = {"SELECT * FROM table1", "SELECT * FROM table2"};
        SQLTerm[] arrSQLTerms = new SQLTerm[sqlTerms.length];
        for (int i = 0; i < sqlTerms.length; i++) {
            arrSQLTerms[i] = new SQLTerm(sqlTerms[i]);
        }

        CsvWriter csvWriter = new CsvWriter();
        try {
            csvWriter.init();
            (csvWriter.getWriter().write(arrSQLTerms));
            // This should not throw an exception
        } catch (DBAppException e) {
            fail("Expected DBAppException");
        }
    }

    @Test
    public void [MethodUnderTest][InsertIntoTable]

    Test() {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");

        db.insertIntoTable("table3", htblColNameValue);

        assert db.getMyTables().contains("table3");
    }

    @Test
    public void [MethodUnderTest][UpdateTable]

    Test() {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");

        db.updateTable("table4", "cluster_key", htblColNameValue);

        assert db.getMyTables().contains("table4");
    }

    @Test
    public void [MethodUnderTest][DeleteFromTable]

    Test() {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");

        db.deleteFromTable("table5", htblColNameValue);

        assert !db.getMyTables().contains("table5");
    }

    @Test
    public void [MethodUnderTest][SelectFromTable]

    Test() {
        SQLTerm[] arrSQLTerms = {"SELECT * FROM table6"};

        Iterator<CSVRow> rows = db.selectFromTable(arrSQLTerms, new String[]{"column1", "column2"});

        for (CSVRow row : rows) {
            assertNotNull(row);
        }
    }

}