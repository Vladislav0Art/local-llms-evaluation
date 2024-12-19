package org.jsoup.helper;

public class GeneratedBuildNormalizesRef {

    @Test
    public void buildNormalizesRef() {
        URL inputUrl = new URL("http://example.com/path#refWithSpaces");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(urlBuilder.u.getRef(), "%20");
    }

}