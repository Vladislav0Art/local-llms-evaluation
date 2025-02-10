package app;

public class GeneratedTestInsert {

    private DB db;

    @Before
    public void setUp() {
        db = new DB();
    }

    @Test
    public void testInsert() {
        Table table = new Table("my_table");
        db.insert(table);
    }

}