package org.jsoup.helper;

public class GeneratedTest {

    public interface KeyVal {
        String of(int key, String value) {
            return "key=" + key + "&value=" + value;
        }
    }

    public static class Builder {
        private URL url;

        public void setUrl(String url) {
            this.url = new URL(url);
        }

        public Builder appendKeyVal(Connection.KeyVal keyVal) {
            if (url == null) {
                return this;
            }
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

        private String query;

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        private URL url;
    }

    public static class UrlBuilder extends Connection.Builder {
    }
}

public class Test {

}