package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_empty_key {

    @Test
    public void testAppendKeyVal_empty_key() {
        String key = "";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(new Connection.KeyVal(key, value));
        try {
            builder.appendKeyVal(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}