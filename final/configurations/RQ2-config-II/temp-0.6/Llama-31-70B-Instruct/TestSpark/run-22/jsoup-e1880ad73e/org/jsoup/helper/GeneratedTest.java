package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void buildTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        URL url = null;
        try {
            url = new URL("https://example.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        assertEquals(url, urlBuilder.build());
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        Connection.KeyVal kv = new Connection.KeyVal("key", "val");
        urlBuilder.appendKeyVal(kv);
        assertEquals("key=val", kv.value());
    }

}