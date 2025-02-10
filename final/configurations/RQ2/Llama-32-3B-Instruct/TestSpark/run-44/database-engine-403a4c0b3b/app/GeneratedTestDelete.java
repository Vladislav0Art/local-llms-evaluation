package app;

public class GeneratedTestDelete {

    private DB db;

    @Before
    public void setUp() {
        db = new DB();
    }

    @Test
    public void testDelete() {
        Table table = new Table("my_table");
        db.deleteFromTable(table);
    }
}

public class DB {
    private Table[] tables;

    public DB() {
        tables = new Table[0];
    }

    public void insert(Table table) {
        Table[] tempTables = new Table[tables.length + 1];
        System.arraycopy(tables, 0, tempTables, 0, tables.length);
        tempTables[tables.length] = table;
        tables = tempTables;
    }

    public Iterator selectFromTable(SQLTerm[] arrSQLTerms, String[] strarrOperators) {
        // implementation
        return null;
    }

    public void update(Table table) {
        for (Table t : tables) {
            if (t.equals(table)) {
                // implementation
                return;
            }
        }
    }

    public void deleteFromTable(Table table) {
        for (int i = 0; i < tables.length; i++) {
            if (tables[i].equals(table)) {
                Table[] tempTables = new Table[tables.length - 1];
                System.arraycopy(tables, 0, tempTables, 0, i);
                System.arraycopy(tables, i + 1, tempTables, i, tables.length - i - 1);
                tables = tempTables;
                return;
            }
        }
    }
}

public class Table {
    private String name;

    public Table(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return name.equals(table.name);
    }
}

public class SQLTerm {
    private String term;

    public SQLTerm(String term) {
        this.term = term;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SQLTerm sqlTerm = (SQLTerm) o;
        return term.equals(sqlTerm.term);
    }

}