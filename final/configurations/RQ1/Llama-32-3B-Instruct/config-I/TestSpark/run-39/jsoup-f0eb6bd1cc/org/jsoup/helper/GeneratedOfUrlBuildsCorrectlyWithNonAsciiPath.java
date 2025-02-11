package org.jsoup.helper;

public class GeneratedOfUrlBuildsCorrectlyWithNonAsciiPath {

    @Test
    public void ofUrlBuildsCorrectlyWithNonAsciiPath() {
        URL u = new URL("https://example.com?path=%C3%A9cole&ref=def");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("https://example.com?path=%C3%A9cole%26def"), builder.build());
    }

}