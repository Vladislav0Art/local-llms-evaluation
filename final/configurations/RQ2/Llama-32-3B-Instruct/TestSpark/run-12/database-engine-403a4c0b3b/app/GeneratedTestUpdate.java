package app;

public class GeneratedTestUpdate {

    private Database db;

    @Before
    public void setup() {
        db = new Database();
        // Setup database
    }

    @Test
    public void testUpdate() {
        // Arrange
        String[] values = {"1", "2", "3"};
        // Act
        db.update("testTable", "testColumn", values);
        // Assert
        assertEquals(3, db.countRows("testTable"));
    }

}