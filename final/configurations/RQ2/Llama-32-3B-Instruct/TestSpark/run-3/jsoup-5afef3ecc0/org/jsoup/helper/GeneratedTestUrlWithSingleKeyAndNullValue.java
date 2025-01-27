package org.jsoup.helper;

public class GeneratedTestUrlWithSingleKeyAndNullValue {

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
    public void testUrlWithSingleKeyAndNullValue() {
        ConnectionKeyVal connectionKeyVal = new ConnectionKeyVal("http://example.com?key");
        assertEquals(null, connectionKeyVal.getKey("key"));
    }

}