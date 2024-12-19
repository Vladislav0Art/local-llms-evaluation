package org.jsoup.helper;

public class GeneratedTestUrlWithoutQuery {

    private KeyVal[] keyVals;

    public Connection(KeyVal... keyVals) {
        this.keyVals = keyVals;
    }

    public String getQuery() {
        StringBuilder queryBuilder = new StringBuilder();
        for (int i = 0; i keyVals.length;
        i++){
            if (i > 0) {
                queryBuilder.append("&");
            }
            queryBuilder.append(keyVals[i].getKey()).append("=").append(keyVals[i].getValue());
        }
        return queryBuilder.toString();
    }

    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }
}

public class UrlBuilder {
    private String url;

    public UrlBuilder(String url) {
        this.url = url;
    }

    public String buildUrl() {
        return url;
    }

    public void addQueryParameter(String key, String value) {
        if (!url.contains("?")) {
            url += "?" + key + "=" + value;
        } else {
            url += "&" + key + "=" + value;
        }
    }

    public static class Builder {
        private String url;

        public Builder(String url) {
            this.url = url;
        }

        public UrlBuilder build() {
            return new UrlBuilder(url);
        }

        public void addQueryParameter(String key, String value) {
            if (!url.contains("?")) {
                url += "?" + key + "=" + value;
            } else {
                url += "&" + key + "=" + value;
            }
        }
    }

    public static class UrlBuilder {
        private String url;

        public UrlBuilder(String url) {
            this.url = url;
        }

        public String getQuery() {
            if (!url.contains("?")) {
                return "";
            }
            int queryStartIndex = url.indexOf('?') + 1;
            StringBuilder queryBuilder = new StringBuilder();
            for (int i = queryStartIndex; i url.length();
            i++){
                char c = url.charAt(i);
                if (c == '&') {
                    queryBuilder.append("&");
                } else {
                    queryBuilder.append(url.substring(queryStartIndex, i));
                }
            }
            return queryBuilder.toString();
        }

        public static UrlBuilder build(String url) {
            return new UrlBuilder(url);
        }
    }
}

public class UrlBuilderTest {

    @Test
    public void testUrlWithoutQuery() {
        String url = "https://example.com";
        UrlBuilder.UrlBuilder urlBuilder = UrlBuilder.build(url);
        assertEquals("", urlBuilder.getQuery());
    }

}