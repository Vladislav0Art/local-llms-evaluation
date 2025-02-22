package app;

public class GeneratedGetReaderTest {

    private DBApp dbApp;

    @BeforeEach
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void getReaderTest() {
        assertNotNull(dbApp.getReader());
    }

}