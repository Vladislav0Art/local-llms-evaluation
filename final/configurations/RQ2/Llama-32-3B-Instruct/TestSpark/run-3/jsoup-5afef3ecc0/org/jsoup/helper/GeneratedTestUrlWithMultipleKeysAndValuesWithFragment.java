package org.jsoup.helper;

public class GeneratedTestUrlWithMultipleKeysAndValuesWithFragment {

    private String url;

    public ConnectionKeyVal(String url) {
        this.url = parseUrl(url);
    }

    private String parseUrl(String url) {
        int keyIndex = url.indexOf('?');
        if (keyIndex == -1) return url;
        return url.substring(keyIndex + 1);
    }

    public String getKey(String key) {
        return url.split("&")[0].split("=")[1];
    }
}

public class ConnectionKeyValTests {

    @Test
    public void testUrlWithMultipleKeysAndValuesWithFragment() {
        ConnectionKeyVal connectionKeyVal = new ConnectionKeyVal("http://example.com?key1=value1&key2=value2#fragment");
        assertEquals("value1", connectionKeyVal.getKey("key1"));
        assertEquals("value2", connectionKeyVal.getKey("key2"));
    }

}