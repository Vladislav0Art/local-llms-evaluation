package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_withQuery {

    private final String inputUrl = "https://example.com/path?query=abc#fragment";

    @Test
    public void testAppendKeyVal_withQuery() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL(inputUrl));
        builder.appendKeyVal(new KeyVal("key", "value"), true);
        String expected = inputUrl + "?key=value";
        assertEquals(expected, builder.build().toASCIIString());
    }

}