package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedAppendKeyVal_null_value {

    @Test
    public void appendKeyVal_null_value() {
        String key = "foo";
        nullValue = new MockHttpUrl("https://example.com", mockConnection());

        UrlBuilder builder = new UrlBuilder(nullValue);
        try {
            builder.appendKeyVal(key);
            assertNull(builder.get());
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    public void test_urlBuilder() {
    }

    private MockHttpUrl mockHttpUrl;
    private MockConnection mockConnection;

    @BeforeEach
    public void setup() {
        mockConnection = new MockConnection();
        mockHttpUrl = new MockHttpUrl("https://example.com", mockConnection);
    }

}