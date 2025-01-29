package com.adobe.epubcheck.opf;

public class GeneratedTestIsVideoType {

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
    public void testIsVideoType() throws Exception {
        String type = "video/mpeg";
        Object result = OPFChecker30.class.getMethod("isVideoType", String.class).invoke(instance, type);
        Assert.assertTrue(result instanceof Boolean);
    }

}