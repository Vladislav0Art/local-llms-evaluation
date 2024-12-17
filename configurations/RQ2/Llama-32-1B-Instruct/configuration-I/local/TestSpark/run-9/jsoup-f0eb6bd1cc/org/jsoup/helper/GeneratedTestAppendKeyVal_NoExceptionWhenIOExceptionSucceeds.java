package org.jsoup.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestAppendKeyVal_NoExceptionWhenIOExceptionSucceeds {

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
    public void testAppendKeyVal_NoExceptionWhenIOExceptionSucceeds() throws IOException {
        urlBuilder = new UrlBuilder(connection);
        when(connection.getInputStream()).thenReturn(new java.io.ByteArrayInputStream());
        urlBuilder.appendKeyVal(kv1);
        assertTrue(urlBuilder.build().getQueryParams().containsKey("key2"));
        assertEquals(expected, urlBuilder.build().getQueryString());
    }

}