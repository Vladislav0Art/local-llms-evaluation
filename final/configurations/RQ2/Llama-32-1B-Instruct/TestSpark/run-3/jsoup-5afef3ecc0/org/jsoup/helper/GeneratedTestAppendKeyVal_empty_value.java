package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_empty_value {

    @Test
    public void testAppendKeyVal_empty_value() {
        String key = "key";
        String emptyValue = "";
        UrlBuilder builder = new UrlBuilder(new Connection.KeyVal(key, emptyValue));
        try {
            builder.appendKeyVal(emptyValue);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}