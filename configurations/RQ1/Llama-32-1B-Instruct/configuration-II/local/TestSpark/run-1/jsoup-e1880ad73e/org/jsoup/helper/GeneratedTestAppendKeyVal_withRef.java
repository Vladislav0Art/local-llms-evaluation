package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_withRef {

    private final String inputUrl = "https://example.com/path?query=abc#fragment";

    @Test
    public void testAppendKeyVal_withRef() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL(inputUrl));
        builder.appendKeyVal(new KeyVal("key", "value"), false);
        String expected = inputUrl + "?ref=abc";
        assertEquals(expected, builder.build().toASCIIString());
    }

}