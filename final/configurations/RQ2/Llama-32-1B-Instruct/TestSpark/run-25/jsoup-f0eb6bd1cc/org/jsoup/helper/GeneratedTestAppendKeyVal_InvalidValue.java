package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_InvalidValue {

    @Test
    public void testAppendKeyVal_InvalidValue() throws UnsupportedEncodingException {
        String inputUrl = "http://example.com";
        StringBuilder sb = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(inputUrl).appendKeyVal(new KeyVal("key", "value"));
        assertThrow(UnsupportedEncodingException.class, () -> builder.appendKeyVal(new KeyVal("key", "wrong_value")));
    }

}