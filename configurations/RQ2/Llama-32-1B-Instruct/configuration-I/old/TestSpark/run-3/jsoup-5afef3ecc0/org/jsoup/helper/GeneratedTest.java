package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void build_urlBuilder() {
        String url = "https://example.com";
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(url, builder.build().getURI());
    }

    @Test
    public void appendKeyVal() {
        String key = "foo";
        String value = "bar";
        MockConnection mockConn = new MockConnection();
        mockConn.setKeepAlive(false);

        MockHttpUrl mockHttpUrl = new MockHttpUrl("https://example.com", mockConn);
        builder = new UrlBuilder(mockHttpUrl);

        String kv = "key=" + key;
        try {
            builder.appendKeyVal(new java.util.HashMap<String, String>() {{
                put(key, value);
            }});
            assertNull(builder.get());
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void build_urlBuilder_empty_input() {
        MockConnection mockConn = new MockConnection();
        mockConn.setKeepAlive(false);

        UrlBuilder builder = new UrlBuilder(mockConn);
        assertEquals("", builder.build().getURI());
    }

    @Test
    public void appendKeyVal_not_null() {
        String key = "foo";
        String value = "bar";

        UrlBuilder builder = new UrlBuilder(new MockHttpUrl("https://example.com", mockConnection()));
        try {
            builder.appendKeyVal(null);
            assertNull(builder.get());
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void appendKeyVal_null_key() {
        String key = null;
        String value = "bar";

        UrlBuilder builder = new UrlBuilder(new MockHttpUrl("https://example.com", mockConnection()));
        try {
            builder.appendKeyVal(value);
            assertNull(builder.get());
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

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