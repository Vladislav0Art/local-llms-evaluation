package org.jsoup.helper;

public class GeneratedTestUrlBuilder {

    private Map<String, String> map = new HashMap<>();

    public void add(String key, String value) {
        this.map.put(key, value);
    }

    public String build() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.map.entrySet()) {
            sb.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    @Override
    public String toString() throws URISyntaxException, UnsupportedEncodingException {
        return this.build();
    }
}

public class UrlBuilderTest {

    @Test
    public void testUrlBuilder() throws URISyntaxException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder();
        urlBuilder.add("key1", "value1");
        urlBuilder.add("key2", "value2");

        String expectedUrl = "key1=value1&key2=value2";
        assertEquals(expectedUrl, urlBuilder.toString());
    }

}