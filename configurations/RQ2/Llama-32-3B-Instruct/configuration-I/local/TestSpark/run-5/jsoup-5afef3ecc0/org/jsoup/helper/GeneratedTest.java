package org.jsoup.helper;

public class GeneratedTest {

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

    public void appendKeyVal(Connection.KeyVal keyVal) {
        if (url.isEmpty()) {
            url = String.format("%s=%s", keyVal.getKey(), keyVal.getValue());
        } else {
            url += "&" + String.format("%s=%s", keyVal.getKey(), keyVal.getValue());
        }
    }

    public URL build() {
        try {
            return new java.net.URL(url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}

public class UrlBuilderTest {

}