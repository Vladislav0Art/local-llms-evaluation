package org.jsoup.helper;

public class GeneratedTestUrlBuilderAppendKeyVal {

    @Test
    public void testUrlBuilderAppendKeyVal() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path/to/resource?key=value&foo=bar");
        urlBuilder.appendKeyVal(new UrlKeyVal("key", "value"));
        assert urlBuilder.u.getQuery().contains("key=value");
    }

}