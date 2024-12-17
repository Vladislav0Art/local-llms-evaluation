package org.jsoup.helper;

public class Generated[
UrlBuilder_init WithValidUrl]

Test {

    @Test
    public void [UrlBuilder_init WithValidUrl]Test() {
        URL url = new URL("https://example.com/path?query=value#ref");
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder.u);
        assertEquals("https://example.com/path", URLConstructor.toString(builder.u));
    }

}