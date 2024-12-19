package org.jsoup.helper;

public class GeneratedTestUrlBuilder {

    private StringBuilder url;

    public UrlBuilder append(String value) {
        url.append(value);
        return this;
    }

    public UrlBuilder append(UrlBuilder.KeyVal kv) {
        url.append(kv.getKey()).append("=").append(kv.getValue());
        return this;
    }

    @Override
    public String toString() {
        return url.toString();
    }
}

public class UrlBuilder.

KeyVal {
    private String key;
    private String value;

    public UrlBuilder.KeyVal(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey () {
        return key;
    }

    public String getValue () {
        return value;
    }
}

public class GeneratedTest {

    @Test
    public void testUrlBuilder() throws Exception {
        UrlBuilder builder = new UrlBuilder();
        String url = builder.append("http://example.com");
        assertEquals("http://example.com", url);
    }

}