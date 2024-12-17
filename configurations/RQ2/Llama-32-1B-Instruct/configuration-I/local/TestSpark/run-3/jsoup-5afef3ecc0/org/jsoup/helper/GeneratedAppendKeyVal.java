package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedAppendKeyVal {

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

}