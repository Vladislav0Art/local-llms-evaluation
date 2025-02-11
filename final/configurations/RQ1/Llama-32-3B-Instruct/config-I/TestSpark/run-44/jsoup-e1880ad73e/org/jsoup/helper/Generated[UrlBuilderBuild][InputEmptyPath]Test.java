package org.jsoup.helper;

public class Generated[UrlBuilderBuild][InputEmptyPath]

Test {

    @Test
    public void [UrlBuilderBuild][InputEmptyPath]Test() {
        URL url = new URL("http://example.com/path=");
        UrlBuilder builder = new UrlBuilder(url);
        URL normUrl = builder.build();
        assertEquals("http://example.com/", normUrl.toString());
    }

}