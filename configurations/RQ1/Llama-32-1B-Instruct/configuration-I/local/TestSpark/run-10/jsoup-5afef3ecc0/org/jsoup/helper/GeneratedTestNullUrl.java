package org.jsoup.helper;

public class GeneratedTestNullUrl {

    @Test
    public void testNullUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assert null == urlBuilder.u;
    }

}