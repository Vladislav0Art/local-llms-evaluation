package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_withFragment {

    private final String inputUrl = "https://example.com/path?query=abc#fragment";

    @Test
    public void testAppendKeyVal_withFragment() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL(inputUrl));
        builder.appendKeyVal(new KeyVal("key", "value"), true);
        String expected = inputUrl + "#fragment";
        assertEquals(expected, builder.build().toASCIIString());
    }

}