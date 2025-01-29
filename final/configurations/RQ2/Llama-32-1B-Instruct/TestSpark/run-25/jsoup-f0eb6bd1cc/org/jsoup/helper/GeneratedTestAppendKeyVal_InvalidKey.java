package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_InvalidKey {

    @Test
    public void testAppendKeyVal_InvalidKey() throws UnsupportedEncodingException {
        String inputUrl = "http://example.com";
        StringBuilder sb = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(inputUrl).appendKeyVal(new KeyVal("key", "value"));
        assertThrow(UnsupportedEncodingException.class, () -> builder.appendKeyVal(new KeyVal("wrong_key", "value")));
    }

}