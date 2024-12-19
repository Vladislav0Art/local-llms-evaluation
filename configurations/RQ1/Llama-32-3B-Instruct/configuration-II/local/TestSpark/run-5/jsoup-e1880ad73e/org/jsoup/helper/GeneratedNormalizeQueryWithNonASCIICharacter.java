package org.jsoup.helper;

public class GeneratedNormalizeQueryWithNonASCIICharacter {

    private UrlBuilder urlBuilder;

    @Test
    public void normalizeQueryWithNonASCIICharacter() {
        URL url = new URL("http://example.com/path?query=abc&éxámpLè#fragment");
        urlBuilder = new UrlBuilder(url);
        assertNotNull(urlBuilder.q);
        assertTrue(urlBuilder.q.toString().contains("%3A%2B"));
    }

}