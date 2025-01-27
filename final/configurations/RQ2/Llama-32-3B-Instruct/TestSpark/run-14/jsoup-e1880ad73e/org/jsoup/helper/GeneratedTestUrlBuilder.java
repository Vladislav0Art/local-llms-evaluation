package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() {
        UrlBuilder urlBuilder = new UrlBuilder();
        urlBuilder.appendKeyVal(Connection.KeyVal.create("key", "value"));
        String uri = urlBuilder.build().toString();
        assertEquals(baseUrl, uri);
    }

}