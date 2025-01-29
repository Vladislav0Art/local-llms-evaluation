package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_SimpleScenario_NullKey {

    private String inputUrl = "https://example.com";

    @Test
    public void testAppendKeyVal_SimpleScenario_NullKey() throws UnsupportedEncodingException {
        KeyVal kv = null;
        try {
            urlBuilder.appendKeyVal(kv);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}