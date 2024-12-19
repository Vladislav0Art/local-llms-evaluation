package org.jsoup.helper;

public class GeneratedTestBuild {

    private static final String SIMPLE_URL = "https://example.com/path?query=value";

    @Test
    public void testBuild() throws Exception {
        URL u = new URL(SIMPLE_URL);
        UrlBuilder builder = new UrlBuilder(u);
        assert builder.u != null;
        String normUrl = builder.build();
        assertEquals("https://example.com/path", normUrl);
    }

}