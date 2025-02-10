package org.jsoup.helper;

public class GeneratedTest {

    private Map<String, String> map = new HashMap<>();

    public void add(String key, String value) {
        this.map.put(key, value);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(entry.getKey()).append("=").append(entry.getValue());
        }
        return sb.toString();
    }
}

public class UrlBuilderTest {

    @Test
    public void constructor() {
        // no-arg test
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertNotNull(urlBuilder);
    }

}