package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestUrlBuilderWithQueryParams {

    @Test
    public void testUrlBuilderWithQueryParams() {
        UrlBuilder urlBuilder = new UrlBuilder();
        urlBuilder.addQueryParam("a", "1");
        urlBuilder.addQueryParam("b", "2");
        assertEquals("https://example.com?a=1&b=2", urlBuilder.build());
    }
}

public class UrlBuilder {

    private String url;

    public UrlBuilder() {
        this.url = "https://example.com";
    }

    public void addQueryParam(String key, String value) {
        if (url.contains("?")) {
            url += "&" + key + "=" + value;
        } else {
            url += "?" + key + "=" + value;
        }
    }

    public String build() {
        return url;
    }

}