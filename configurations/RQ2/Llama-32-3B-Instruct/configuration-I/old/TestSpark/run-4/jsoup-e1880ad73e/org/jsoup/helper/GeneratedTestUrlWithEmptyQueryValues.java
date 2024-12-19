package org.jsoup.helper;

public class GeneratedTestUrlWithEmptyQueryValues {

    @Test
    public void testUrlWithEmptyQueryValues() {
        String url = "https://example.com?query=&key2=value";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
        assertEquals("key1=value1&key2=", urlBuilder.build().getQuery());
    }

    public class Connection {
        private KeyVal[] keyVals;

        public Connection(KeyVal... keyVals) {
            this.keyVals = keyVals;
        }

        public String getQuery() {
            StringBuilder query = new StringBuilder();
            for (KeyVal keyVal : keyVals) {
                if (query.length() > 0) {
                    query.append("&");
                }
                query.append(keyVal.getKey()).append("=").append(keyVal.getValue());
            }
            return query.toString();
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
        private URL url;

        public UrlBuilder(URL url) {
            this.url = url;
        }

        public String build() {
            try {
                return url.toString();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public String getQuery() {
            return url.getQuery();
        }
    }

}