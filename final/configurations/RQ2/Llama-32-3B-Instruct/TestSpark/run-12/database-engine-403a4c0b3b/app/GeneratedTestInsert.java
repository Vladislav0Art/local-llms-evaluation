package app;

public class GeneratedTestInsert {

    private Database db;

    @Before
    public void setup() {
        db = new Database();
        // Setup database
    }

    @Test
    public void testInsert() {
        // Arrange
        String[] values = {"1", "2", "3"};
        // Act
        db.insert("testTable", "testColumn", values);
        // Assert
        assertEquals(3, db.countRows("testTable"));
    }

}