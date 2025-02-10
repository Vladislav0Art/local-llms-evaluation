package org.jsoup.helper;

public class GeneratedTestUrlBuilderEmpty {

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
    public void testUrlBuilderEmpty() throws URISyntaxException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder();
        String expectedUrl = "";
        assertEquals(expectedUrl, urlBuilder.toString());
    }

}