package org.jsoup.helper;

public class GeneratedTestNullQuery {

    @Test
    public void testNullQuery() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com?query=value"));
        assert null == urlBuilder.q;
    }

}