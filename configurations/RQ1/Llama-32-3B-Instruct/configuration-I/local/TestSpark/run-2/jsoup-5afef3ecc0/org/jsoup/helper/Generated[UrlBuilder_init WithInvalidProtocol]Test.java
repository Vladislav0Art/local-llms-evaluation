package org.jsoup.helper;

public class Generated[
UrlBuilder_init WithInvalidProtocol]

Test {

    @Test
    public void [UrlBuilder_init WithInvalidProtocol]Test() {
        URL url = new URL("invalid:protocol://example.com/path?query=value#ref");
        UrlBuilder builder = new UrlBuilder(url);
        assertNull(builder.u);
    }

}