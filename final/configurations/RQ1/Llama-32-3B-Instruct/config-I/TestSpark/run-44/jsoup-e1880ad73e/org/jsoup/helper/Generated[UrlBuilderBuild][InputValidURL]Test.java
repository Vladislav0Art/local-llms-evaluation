package org.jsoup.helper;

public class Generated[UrlBuilderBuild][InputValidURL]

Test {

    @Test
    public void [UrlBuilderBuild][InputValidURL]Test() {
        URL url = new URL("http://example.com/path");
        UrlBuilder builder = new UrlBuilder(url);
        URL normUrl = builder.build();
        assertNotNull(normUrl);
        assertEquals("http://example.com/path", normUrl.toString());
    }

}