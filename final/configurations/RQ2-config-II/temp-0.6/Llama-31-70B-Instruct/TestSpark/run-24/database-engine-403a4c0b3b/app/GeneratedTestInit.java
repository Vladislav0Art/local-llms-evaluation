package app;

public class GeneratedTestInit {

    private DBApp app;

    @Before
    public void setUp() {
        app = new DBApp();
    }

    @Test
    public void testInit() {
        app.init();
        assertNotNull(app.getMyTables());
    }

}