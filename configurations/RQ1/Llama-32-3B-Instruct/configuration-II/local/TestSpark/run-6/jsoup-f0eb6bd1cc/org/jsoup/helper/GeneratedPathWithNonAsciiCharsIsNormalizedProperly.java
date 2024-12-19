package org.jsoup.helper;

public class GeneratedPathWithNonAsciiCharsIsNormalizedProperly {

    @Test
    public void pathWithNonAsciiCharsIsNormalizedProperly() throws UnsupportedEncodingException {
        String expectedPath = "/path/";
        URL url = new URL("http://example.com" + expectedPath);
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(expectedPath, builder.u.getPath());
    }

}