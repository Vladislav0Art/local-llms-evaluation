package org.jsoup.helper;

public class Generated[UrlBuilderConstructor][InputValidURL]

Test {

    @Test
    public void [UrlBuilderConstructor][InputValidURL]Test() {
        URL url = new URL("http://example.com/path");
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder.u);
        assertNull(builder.q);
    }

}