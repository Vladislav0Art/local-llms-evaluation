package org.jsoup.helper;

public class GeneratedTestBuildWithoutFragment {

    @Test
    public void testBuildWithoutFragment() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path?query=value");
        String[] expected = {"http://example.com/path", null};
        for (String key : expected) {
            assertEquals(key, urlBuilder.build().getQuery());
        }
    }

}