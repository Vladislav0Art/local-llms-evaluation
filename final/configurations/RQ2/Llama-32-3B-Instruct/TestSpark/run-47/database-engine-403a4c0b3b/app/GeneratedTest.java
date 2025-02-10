package app;

public class GeneratedTest {

    @Test
    public void createTable() {
        Table table = new Table();
        table.createTable("myTable", "id");
        // Create table test logic here
    }

    @Test
    public void selectFromTable() {
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String strarrOperators = "";

        // Select from table test logic here
    }
}

public class Table {

    private String name;
    private String id;

    public Table(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void createTable(String tableName, String idColumn, java.util.Hashtable<String, String> htblClNameType, java.util.Hashtable<String, Object> htblColNameValue) {
        System.out.println("Creating table: " + tableName);
        for (String column : htblClNameType.keySet()) {
            System.out.print(column + ": ");
            if (htblColNameValue.get(column) instanceof String) {
                String[] values = ((String) htblColNameValue.get(column)).split(",");
                for (String value : values) {
                    System.out.print(value.trim() + ", ");
                }
            } else {
                System.out.println(htblColNameValue.get(column));
            }
            System.out.println();
        }
    }

    public void selectFromTable(SQLTerm[] arrSQLTerms, String strarrOperators) {
        System.out.println("Selecting from table");
        for (SQLTerm term : arrSQLTerms) {
            System.out.print(term.getTerm() + " ");
        }
        System.out.println(strarrOperators);
    }
}

public class SQLTerm {

    private String term;

    public SQLTerm(String term) {
        this.term = term;
    }

    public String getTerm() {
        return term;
    }

}