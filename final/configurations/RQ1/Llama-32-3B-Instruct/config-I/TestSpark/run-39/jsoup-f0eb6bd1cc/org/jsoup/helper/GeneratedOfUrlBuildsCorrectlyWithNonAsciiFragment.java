package org.jsoup.helper;

public class GeneratedOfUrlBuildsCorrectlyWithNonAsciiFragment {

    @Test
    public void ofUrlBuildsCorrectlyWithNonAsciiFragment() {
        URL u = new URL("https://example.com?path=%C3%A9cole&ref=%C3%B6def");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("https://example.com?path=%C3%A9cole%26oe#%C3%B6def"), builder.build());
    }

}