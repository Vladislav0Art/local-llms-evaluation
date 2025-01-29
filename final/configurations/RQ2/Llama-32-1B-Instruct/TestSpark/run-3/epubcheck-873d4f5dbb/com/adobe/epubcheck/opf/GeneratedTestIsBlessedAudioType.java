package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedAudioType {

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
    public void testIsBlessedAudioType() throws Exception {
        String type = "audio/burn";
        Object result = instance.isBlessedAudioType(type);
        Assert.assertTrue(result instanceof Boolean);
    }

}