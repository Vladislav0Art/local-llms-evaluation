package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testBuildWithoutQuery() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expected = new URL("http://example.com");
        assertEquals(expected, urlBuilder.build());
    }

}