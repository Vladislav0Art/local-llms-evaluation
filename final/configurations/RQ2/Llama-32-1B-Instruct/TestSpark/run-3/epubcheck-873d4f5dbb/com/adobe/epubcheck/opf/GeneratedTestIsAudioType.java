package com.adobe.epubcheck.opf;

public class GeneratedTestIsAudioType {

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
    public void testIsAudioType() throws Exception {
        String type = "audio/mpeg";
        Object result = instance.isAudioType(type);
        Assert.assertTrue(result instanceof Boolean);
    }

}