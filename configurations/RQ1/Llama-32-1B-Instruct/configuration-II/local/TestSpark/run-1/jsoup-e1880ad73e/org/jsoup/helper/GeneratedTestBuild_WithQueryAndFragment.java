package org.jsoup.helper;

public class GeneratedTestBuild_WithQueryAndFragment {

    private final String inputUrl = "https://example.com/path?query=abc#fragment";

    @Test
    public void testBuild_WithQueryAndFragment() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL(inputUrl));
        builder.appendKeyVal(new KeyVal("key", "value"), true);
        String expected = inputUrl + "?query=abc&ref=abc#fragment";
        assertEquals(expected, builder.build().toASCIIString());
    }

}