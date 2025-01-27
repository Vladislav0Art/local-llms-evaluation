package app;

public class GeneratedTestSelect {

    private Database db;

    @Before
    public void setup() {
        db = new Database();
        // Setup database
    }

    @Test
    public void testSelect() {
        // Arrange
        String[] strarrOperators = {"AND", "OR"};
        SQLTerm[] arrSQLTerms = {new SQLTerm("column1"), new SQLTerm("column2")};
        // Act
        Iterator iterator = db.selectFromTable(arrSQLTerms, strarrOperators);
        // Assert
        assertTrue(iterator.hasNext());
    }

}