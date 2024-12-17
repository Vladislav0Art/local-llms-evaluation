package org.jsoup.helper;

public class Generated[
UrlBuilder_init WithNoHost]

Test {

    @Test
    public void [UrlBuilder_init WithNoHost]Test() {
        URL url = new URL("/path?query=value#ref");
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder.u);
    }

}