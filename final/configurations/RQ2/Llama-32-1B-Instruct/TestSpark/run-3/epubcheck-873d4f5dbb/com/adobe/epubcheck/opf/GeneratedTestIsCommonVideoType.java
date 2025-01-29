package com.adobe.epubcheck.opf;

public class GeneratedTestIsCommonVideoType {

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
    public void testIsCommonVideoType() throws Exception {
        String type = "video/quicktime";
        Object result = OPFChecker30.class.getMethod("isCommonVideoType", String.class).invoke(instance, type);
        Assert.assertTrue(result instanceof Boolean);
    }

}