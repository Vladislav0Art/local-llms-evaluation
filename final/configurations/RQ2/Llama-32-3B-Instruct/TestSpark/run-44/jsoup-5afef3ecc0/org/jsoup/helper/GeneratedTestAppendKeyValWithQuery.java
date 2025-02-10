package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithQuery {

    public interface KeyVal {
        String of(int key, String value) {
            return "key=" + key + "&value=" + value;
        }
    }

    public static class Builder {
        private String query;

        public Builder appendKeyVal(Connection.KeyVal keyVal) {
            if (query == null) {
                query = Connection.KeyVal.of(keyVal.getKey(), keyVal.getValue());
            } else {
                StringBuilder sb = new StringBuilder(query);
                sb.append("&").append(keyVal.key).append("=").append(keyVal.value);
                query = sb.toString();
            }
            return this;
        }

        public String build() {
            if (query != null && !query.isEmpty()) {
                return url + "?" + query;
            } else {
                return url.toString();
            }
        }
    }

    private URL url;

    public Builder(String url) {
        this.url = new URL(url);
        return new Builder();
    }

    public static class UrlBuilder extends Builder {
    }
}

public class Test {

    @Test
    public void testAppendKeyValWithQuery() {
        String url = "https://example.com/path/to/resource?query=string";
        UrlBuilder builder = new UrlBuilder();
        assertEquals(url, builder.appendKeyVal(Connection.KeyVal.of(0, url)).build());
    }

}