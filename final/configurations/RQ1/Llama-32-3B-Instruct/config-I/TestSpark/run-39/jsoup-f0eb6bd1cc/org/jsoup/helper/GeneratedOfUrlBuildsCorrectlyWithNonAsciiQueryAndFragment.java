package org.jsoup.helper;

public class GeneratedOfUrlBuildsCorrectlyWithNonAsciiQueryAndFragment {

    @Test
    public void ofUrlBuildsCorrectlyWithNonAsciiQueryAndFragment() {
        URL u = new URL("https://example.com?query=abc%C3%B6&ref=%C3%B6def");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("https://example.com?query=abc%26oe#%C3%B6def"), builder.build());
    }

}