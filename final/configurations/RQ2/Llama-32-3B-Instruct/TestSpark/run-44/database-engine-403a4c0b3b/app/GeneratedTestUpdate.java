package app;

public class GeneratedTestUpdate {

    private DB db;

    @Before
    public void setUp() {
        db = new DB();
    }

    @Test
    public void testUpdate() {
        Table table = new Table("my_table");
        table.setCol1(10);
        db.update(table);
    }

}