package app;

public class GeneratedTestInit {

    private DBApp dbApp;
    private Validator validator;

    @Before
    public void setup() {
        dbApp = new DBApp();
        validator = new Validator();
    }

    @Test
    public void testInit() {
        dbApp.init();
        assertFalse(dbApp.isInitialized());
    }

}