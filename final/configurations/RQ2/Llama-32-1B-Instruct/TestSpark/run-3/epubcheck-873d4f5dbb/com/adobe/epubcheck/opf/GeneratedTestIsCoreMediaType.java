package com.adobe.epubcheck.opf;

public class GeneratedTestIsCoreMediaType {

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
    public void testIsCoreMediaType() throws Exception {
        String type = "application/vnd.adobe.epub-m4+zip";
        Object result = OPFChecker30.class.getMethod("isCoreMediaType", String.class).invoke(instance, type);
        Assert.assertTrue(result instanceof Boolean);
    }

}