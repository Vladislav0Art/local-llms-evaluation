package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedAppendKeyValWithValidKeyAndValue_AddsToQuery {

    @Test
    public void appendKeyValWithValidKeyAndValue_AddsToQuery() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/path/to/resource"));
        urlBuilder.appendKeyVal(kv);
        assertEquals(2, urlBuilder.q.toString().split("&").length);
    }

}