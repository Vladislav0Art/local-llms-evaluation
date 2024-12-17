package org.jsoup.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestAppendKeyVal {

    private final String inputUrl = "https://example.com";
    private final String base = "/path/to/base";

    @BeforeEach
    public void setup() {
        MockConnection mockConn = new MockConnection();
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");

        UrlBuilder urlBuilder = new UrlBuilder(mockConn);
    }

    @Test
    public void testAppendKeyVal() {
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);
        assertTrue(urlBuilder.build().getQueryParams().containsKey("key1"));
        assertTrue(urlBuilder.build().getQueryParams().containsKey("key2"));
        String expected = "key1=value1&key2=value2";
        assertEquals(expected, urlBuilder.build().getQueryString());
    }

}