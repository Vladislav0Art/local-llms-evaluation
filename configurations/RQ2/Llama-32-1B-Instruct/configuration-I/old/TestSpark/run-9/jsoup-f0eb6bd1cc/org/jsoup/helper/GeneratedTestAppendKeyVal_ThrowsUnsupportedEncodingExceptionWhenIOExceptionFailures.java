package org.jsoup.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestAppendKeyVal_ThrowsUnsupportedEncodingExceptionWhenIOExceptionFailures {

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
    public void testAppendKeyVal_ThrowsUnsupportedEncodingExceptionWhenIOExceptionFailures() throws IOException {
        urlBuilder = new UrlBuilder(connection);
        when(connection.getInputStream()).thenThrow(new IOException("io failures"));
        try {
            urlBuilder.appendKeyVal(kv1);
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}