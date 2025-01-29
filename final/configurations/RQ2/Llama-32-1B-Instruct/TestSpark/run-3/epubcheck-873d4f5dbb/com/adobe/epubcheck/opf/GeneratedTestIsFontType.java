package com.adobe.epubcheck.opf;

public class GeneratedTestIsFontType {

    private OPFChecker30 instance;
    private MockObjectHandler mockHandler;

    @Before
    public void setup() {
        instance = new OPFChecker30(null);
        mockHandler = new MockObjectHandler();
    }

    @After
    public void tearDown() {
        instance = null;
        mockHandler = null;
    }

    @Test
    public void testIsFontType() throws Exception {
        String type = "font/tiff";
        Object result = OPFChecker30.class.getMethod("isFontType", String.class).invoke(instance, type);
        Assert.assertTrue(result instanceof Boolean);
    }

}