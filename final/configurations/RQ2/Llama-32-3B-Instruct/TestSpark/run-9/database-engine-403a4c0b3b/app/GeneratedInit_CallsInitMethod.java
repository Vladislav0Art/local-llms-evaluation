package app;

public class GeneratedInit_CallsInitMethod {

    @Test
    public void init_CallsInitMethod() throws Exception {
        DBApp dbApp = new DBApp();
        boolean initCalled = false;
        Method initMethod = new Object() {
        }.getClass().getMethod("init");
        initMethod.invoke(dbApp);
        assertTrue(initCalled);
    }

}