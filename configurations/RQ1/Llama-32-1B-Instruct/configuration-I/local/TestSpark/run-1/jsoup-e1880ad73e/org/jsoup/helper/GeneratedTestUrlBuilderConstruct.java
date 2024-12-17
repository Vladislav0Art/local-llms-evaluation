package org.jsoup.helper;

public class GeneratedTestUrlBuilderConstruct {

    @Test
    public void testUrlBuilderConstruct() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path/to/resource?key=value&foo=bar");
        assert urlBuilder.u != null;
        assert !urlBuilder.q == null || !urlBuilder.u.getQuery().isEmpty();
    }

}