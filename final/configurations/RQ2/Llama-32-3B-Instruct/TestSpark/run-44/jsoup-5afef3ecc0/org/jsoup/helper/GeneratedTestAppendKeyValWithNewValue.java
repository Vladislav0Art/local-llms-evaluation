package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithNewValue {

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
    public void testAppendKeyValWithNewValue() {
        String url = "https://example.com/path/to/resource";
        UrlBuilder builder = new UrlBuilder();
        assertEquals("https://example.com/path/to/resource?query=new=value", builder.appendKeyVal(Connection.KeyVal.of(0, Connection.KeyVal.of(1, "new=value").of(2, url))).build());
    }

}