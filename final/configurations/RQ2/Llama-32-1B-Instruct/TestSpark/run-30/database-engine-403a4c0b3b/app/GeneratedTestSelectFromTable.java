package app;

public class GeneratedTestSelectFromTable {

    private Database db;
    private Serializer serializer;

    @Test
    public void testSelectFromTable() {
        db = new Database();
        db.init();

        HashSet<String> result1 = new HashSet<>();

        db.insertIntoTable("Table1", new Hashtable<>(Arrays.asList("Column1", "Column2")));

        String[] arrSQLTerms = {new SQLTerm("SELECT * FROM Table1")};
        String[] strArrOperators = {"==", "==", ">", "<", ">=", "<="};

        for (String term : arrSQLTerms) {
            result1.add(db.selectFromTable(term, strArrOperators));
        }

        assertTrue(result1.contains("Table1"));
    }
}

class SQLTerm {
    private String expression;

    public SQLTerm(String expression) {
        this.expression = expression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SQLTerm sqlTerm = (SQLTerm) o;
        return Objects.equals(expression, sqlTerm.expression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expression);
    }
}

class Hashtable {
    private Map<String, Object> map;

    public Hashtable(Map<String, Object> map) {
        this.map = map;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hashtable hashtable = (Hashtable) o;
        return Objects.equals(map, hashtable.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }
}

class Table {
    private String name;

    public Table(String name) {
        this.name = name;
    }

    public Map<String, Object> getMap() {
        return map();
    }

}