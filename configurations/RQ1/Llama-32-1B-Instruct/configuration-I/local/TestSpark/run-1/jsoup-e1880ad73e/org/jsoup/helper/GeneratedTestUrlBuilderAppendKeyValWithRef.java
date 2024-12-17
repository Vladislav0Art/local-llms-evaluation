package org.jsoup.helper;

public class GeneratedTestUrlBuilderAppendKeyValWithRef {

    @Test
    public void testUrlBuilderAppendKeyValWithRef() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path/to/resource#ref");
        urlBuilder.appendKeyVal(new UrlKeyVal("key", "value"));
        assert !urlBuilder.u.getRef().equals(null);
        assert urlBuilder.u.getRef().contains("#ref");
    }

}