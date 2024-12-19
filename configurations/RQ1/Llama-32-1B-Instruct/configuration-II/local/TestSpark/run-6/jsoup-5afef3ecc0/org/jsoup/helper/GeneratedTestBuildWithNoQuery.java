package org.jsoup.helper;

public class GeneratedTestBuildWithNoQuery {

    private static final String SIMPLE_URL = "https://example.com/path?query=value";

    @Test
    public void testBuildWithNoQuery() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL(SIMPLE_URL));
        String normUrl = builder.build();
        assertEquals("https://example.com/path", normUrl);
    }

}