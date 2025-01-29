package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_InvalidInput {

    @Test
    public void testAppendKeyVal_InvalidInput() throws UnsupportedEncodingException {
        URLBuilder builder = new UrlBuilder(null);
        assertThrow(UnsupportedEncodingException.class, () -> builder.appendKeyVal(new KeyVal()));
    }

}