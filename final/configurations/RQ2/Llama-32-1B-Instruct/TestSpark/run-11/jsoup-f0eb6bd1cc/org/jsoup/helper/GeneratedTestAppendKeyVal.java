package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    private String url;

    public String build() {
        return url;
    }

    public void appendKeyVal(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            url.appendKeyVal(entry.getKey(), entry.getValue());
        }
    }

    public static class UrlBuilderBuilder {
        private URL url;

        public UrlBuilderBuilder(URL url) {
            this.url = url;
        }

        public UrlBuilderBuilder appendUrl(String value) {
            return this;
        }

        public UrlBuilderBuilder appendKeyVal(String key, String value) {
            if (url != null) {
                url.appendKeyVal(key, value);
            }
            return this;
        }

        public UrlBuilder build() {
            return new UrlBuilder(url);
        }
    }

    public static class MapBuilder {
        private Map<String, String> map;

        public MapBuilder(String prefix, Map<String, String> map) {
            this.map = map != null ? map : new HashMap<>();
            this.prefix = prefix;
        }

        public MapBuilder appendUrl(String value) {
            return this;
        }

        public MapBuilder appendKeyVal(String key, String value) {
            if (map != null) {
                map.put(key, value);
            }
            return this;
        }

        public UrlBuilder build() {
            return new UrlBuilderBuilder(new URL(prefix)).appendUrl(map.toString()).build();
        }
    }

    public static class HashMapBuilder {
        private HashMap<String, String> map;

        public HashMapBuilder(String prefix, HashMap<String, String> map) {
            this.map = map != null ? map : new HashMap<>();
            this.prefix = prefix;
        }

        public HashMapBuilder appendUrl(String value) {
            return this;
        }

        public HashMapBuilder appendKeyVal(String key, String value) {
            if (map != null) {
                map.put(key, value);
            }
            return this;
        }

        public UrlBuilder build() {
            return new UrlBuilderBuilder(new URL(prefix)).appendUrl(map.toString()).build();
        }
    }
}

public class TestUrlBuilder {

    @Test
    public void testAppendKeyVal() {
        UrlBuilder url = new UrlBuilderBuilder().appendUrl("https://example.com").appendKeyVal("key1", "value1");
        System.out.println(url.build());
    }

}