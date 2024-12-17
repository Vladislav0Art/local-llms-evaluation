package org.jsoup.helper;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValWithValidConnectionTest {

    @Test
    public void appendKeyValWithValidConnectionTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new HashMap<String, String>().entrySet().iterator().next();
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(kv);
        assertNotNull(builder.q);
    }

}