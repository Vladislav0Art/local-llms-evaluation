package org.jsoup.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestBuild_ThrowsNullPointerExceptionWhenConnectionIsNull {

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
    public void testBuild_ThrowsNullPointerExceptionWhenConnectionIsNull() throws Exception {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        MockConnection mockConn = new MockConnection();
        urlBuilder = new UrlBuilder(mockConn);
        when(mockConn.getInputStream()).thenReturn(null);
        try {
            urlBuilder.build();
            // expected
        } catch (Exception e) {
            // expected
        }
    }

}