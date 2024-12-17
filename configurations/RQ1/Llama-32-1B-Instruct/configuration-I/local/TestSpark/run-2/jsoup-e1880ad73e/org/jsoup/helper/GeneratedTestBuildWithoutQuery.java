package org.jsoup.helper;

public class GeneratedTestBuildWithoutQuery {

    @Test
    public void testBuildWithoutQuery() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path");
        URL expected = new URL("http://example.com/path#fragment");
        assertEquals(expected, urlBuilder.build());
    }

}