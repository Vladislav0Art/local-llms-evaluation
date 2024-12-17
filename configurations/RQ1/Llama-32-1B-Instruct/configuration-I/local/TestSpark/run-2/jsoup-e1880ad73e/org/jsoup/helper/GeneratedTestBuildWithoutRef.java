package org.jsoup.helper;

public class GeneratedTestBuildWithoutRef {

    @Test
    public void testBuildWithoutRef() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path?query=value");
        String[] expected = {"http://example.com/path", null};
        for (String key : expected) {
            assertEquals(key, urlBuilder.build().getQuery());
        }
    }

}