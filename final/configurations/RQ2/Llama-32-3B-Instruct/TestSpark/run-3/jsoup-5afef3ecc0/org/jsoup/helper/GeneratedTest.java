package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTest {

    private String url;

    public static String parseUrl(String url) {
        int keyIndex = url.indexOf('?');
        if (keyIndex == -1) return url;
        return url.substring(keyIndex + 1);
    }

    public String getKey(String key) {
        Document doc = Jsoup.parse(url);
        return doc.attr("value");
    }
}

public class ConnectionKeyValTests {

    @Test
    public void testUrlWithSingleKeyAndEmptyValue() {
        String url = "http://example.com?key";
        ConnectionKeyVal connectionKeyVal = new ConnectionKeyVal(url);
        assertEquals(null, connectionKeyVal.getKey("key"));
    }
}

class ConnectionKeyVal {

    private String url;

    public ConnectionKeyVal(String url) {
        this.url = url;
    }

    public String getKey(String key) {
        return url.substring(url.indexOf(key + "="));
    }

    @Override
    public String toString() {
        return url;
    }

}