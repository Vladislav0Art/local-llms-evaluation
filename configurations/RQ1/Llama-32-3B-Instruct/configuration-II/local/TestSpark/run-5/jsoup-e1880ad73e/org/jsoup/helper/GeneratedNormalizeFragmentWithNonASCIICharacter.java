package org.jsoup.helper;

public class GeneratedNormalizeFragmentWithNonASCIICharacter {

    private UrlBuilder urlBuilder;

    @Test
    public void normalizeFragmentWithNonASCIICharacter() {
        URL url = new URL("http://example.com/path?query=abc#éxámpLè");
        urlBuilder = new UrlBuilder(url);
        assertNotNull(urlBuilder.u);
        assertTrue(urlBuilder.u.getRef().contains("%3A%2B"));
    }

}