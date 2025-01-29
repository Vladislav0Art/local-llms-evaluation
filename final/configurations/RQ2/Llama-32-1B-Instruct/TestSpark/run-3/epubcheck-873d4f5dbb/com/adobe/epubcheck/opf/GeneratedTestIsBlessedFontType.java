package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedFontType {

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
    public void testIsBlessedFontType() throws Exception {
        String type = "font/burn";
        Object result = OPFChecker30.class.getMethod("isBlessedFontType", String.class).invoke(instance, type);
        Assert.assertTrue(result instanceof Boolean);
    }

}