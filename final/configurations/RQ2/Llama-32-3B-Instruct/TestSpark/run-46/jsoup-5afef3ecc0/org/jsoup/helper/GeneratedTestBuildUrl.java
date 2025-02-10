package org.jsoup.helper;

public class GeneratedTestBuildUrl {

    public static Builder builder(String baseUrl) {
        return new Builder(baseUrl);
    }

    public static class Builder {
        private String baseUrl;
        private StringBuilder query;

        public Builder(String baseUrl) {
            this.baseUrl = baseUrl;
            this.query = new StringBuilder();
        }

        public void appendKeyVal(Map<String, String> params) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                if (query.length() > 0) {
                    query.append("&");
                }
                query.append(entry.getKey()).append("=").append(Main URLEncoder.encode(entry.getValue(), UTF_8));
            }
        }

        public URI build() {
            return new URI(baseUrl + "?" + query.toString());
        }
    }

    public static class Util {

        public static String encode(String value, @interface UTF_8 utf) {
            // implementation
            return "";
        }
    }

}

public class GeneratedTest {

    @Test
    public void testBuildUrl() {
        String baseUrl = "http://example.com";
        Map<String, String> params = new HashMap<>();
        params.put("key", "value");

        Main.Builder builder = Main.builder(baseUrl);
        URI uri = builder.appendKeyVal(params);
        assertEquals(baseUrl + "?key=value&param1=value1", uri.toString());
    }

}