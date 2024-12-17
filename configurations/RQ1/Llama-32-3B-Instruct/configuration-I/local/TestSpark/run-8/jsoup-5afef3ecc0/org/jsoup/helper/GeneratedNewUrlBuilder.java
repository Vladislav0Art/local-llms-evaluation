package org.jsoup.helper;

public class GeneratedNewUrlBuilder {

    @Test
    public void newUrlBuilder() {
        URL inputUrl = new URL("http://test.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assert builder.u != null;
    }

}