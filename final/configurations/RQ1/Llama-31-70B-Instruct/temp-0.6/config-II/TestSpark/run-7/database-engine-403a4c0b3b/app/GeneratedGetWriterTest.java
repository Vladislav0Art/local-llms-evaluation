package app;

public class GeneratedGetWriterTest {

    private DBApp dbApp;

    @BeforeEach
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void getWriterTest() {
        assertNotNull(dbApp.getWriter());
    }

}