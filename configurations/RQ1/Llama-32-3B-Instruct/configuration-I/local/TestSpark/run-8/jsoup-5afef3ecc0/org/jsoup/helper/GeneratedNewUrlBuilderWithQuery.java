package org.jsoup.helper;

public class GeneratedNewUrlBuilderWithQuery {

    @Test
    public void newUrlBuilderWithQuery() {
        URL inputUrl = new URL("http://test.com?query=param");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assert builder.q != null;
    }

}