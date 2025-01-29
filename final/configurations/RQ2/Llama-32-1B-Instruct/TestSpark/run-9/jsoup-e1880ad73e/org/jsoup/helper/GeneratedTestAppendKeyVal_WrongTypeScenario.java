package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WrongTypeScenario {

    private String inputUrl = "https://example.com";

    @Test
    public void testAppendKeyVal_WrongTypeScenario() throws UnsupportedEncodingException {
        Object obj = null;
        try {
            urlBuilder.appendKeyVal(obj);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

}