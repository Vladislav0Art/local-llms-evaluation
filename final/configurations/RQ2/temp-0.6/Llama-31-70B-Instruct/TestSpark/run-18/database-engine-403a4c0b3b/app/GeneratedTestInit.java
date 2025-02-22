package app;

public class GeneratedTestInit {

    @Test
    public void testInit() {
        DBApp app = new DBApp();
        app.init();
        assertNotNull(app.myTables);
        assertEquals(0, app.myTables.size());
    }

}