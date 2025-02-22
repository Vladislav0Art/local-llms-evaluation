package app;

public class GeneratedInitTest {

    private DBApp dbApp;

    @BeforeEach
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void initTest() {
        dbApp.init();
        assertNotNull(dbApp.getMyTables());
    }

}