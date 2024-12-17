package org.jsoup.helper;

public class GeneratedTestBuildWithoutHost {

    @Test
    public void testBuildWithoutHost() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder(null);
        URL expected = new URL("http://example.com/path");
        assertEquals(expected, urlBuilder.build().toString());
    }

}