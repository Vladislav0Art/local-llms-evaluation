package app;

public class GeneratedTestInit {

    @Test
    public void testInit() {
        DBApp app = new DBApp();
        app.init();
        assertNotNull(app.getMyTables());
        assertNotNull(app.getReader());
        assertNotNull(app.getWriter());
    }

}