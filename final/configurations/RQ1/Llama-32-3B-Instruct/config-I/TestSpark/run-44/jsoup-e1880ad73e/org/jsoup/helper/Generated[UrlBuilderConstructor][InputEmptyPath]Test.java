package org.jsoup.helper;

public class Generated[UrlBuilderConstructor][InputEmptyPath]

Test {

    @Test
    public void [UrlBuilderConstructor][InputEmptyPath]Test() {
        URL url = new URL("http://example.com/path=");
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder.u);
        assertNull(builder.q);
    }

}