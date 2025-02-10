package org.jsoup.helper;

public class GeneratedConstructorWithUrlWorks {

    @Test
    public void constructorWithUrlWorks() {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder.build());
    }

}