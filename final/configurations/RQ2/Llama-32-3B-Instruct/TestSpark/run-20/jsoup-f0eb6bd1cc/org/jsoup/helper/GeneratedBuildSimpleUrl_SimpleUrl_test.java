package org.jsoup.helper;

public class GeneratedBuildSimpleUrl_SimpleUrl_test {

    @Test
    public void buildSimpleUrl_SimpleUrl_test() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        URL url = builder.build();
        assertNotNull(url);
        assertEquals("https://example.com", url.toString());
    }

}