package org.jsoup.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestBuild_ThrowsNullPointerExceptionWhenQueryParamsIsEmpty {

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
    public void testBuild_ThrowsNullPointerExceptionWhenQueryParamsIsEmpty() throws Exception {
        String inputUrl = "https://example.com";
        MockConnection mockConn = new MockConnection();
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        urlBuilder = new UrlBuilder(mockConn);
        when(mockConn.getInputStream()).thenReturn(new java.io.ByteArrayInputStream());
        urlBuilder.appendKeyVal(kv1);
        // expected
    }

}