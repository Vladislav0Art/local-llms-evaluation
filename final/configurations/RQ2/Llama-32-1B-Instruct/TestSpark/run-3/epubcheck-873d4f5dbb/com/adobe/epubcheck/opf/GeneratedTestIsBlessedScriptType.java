package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedScriptType {

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
    public void testIsBlessedScriptType() throws Exception {
        String type = "script/css";
        Object result = OPFChecker30.class.getMethod("isBlessedScriptType", String.class).invoke(instance, type);
        Assert.assertTrue(result instanceof Boolean);
    }

}