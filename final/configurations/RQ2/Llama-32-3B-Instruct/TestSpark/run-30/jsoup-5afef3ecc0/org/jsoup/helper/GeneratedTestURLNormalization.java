package org.jsoup.helper;

public class GeneratedTestURLNormalization {

    @Test
    public void testURLNormalization() {
        URL result = new URL("https://example.com?key=value");
        assertNotNull(result);
        assertTrue(IDN.isFullyNormalized(result.getAuthority()));
    }
}

public class IDN {

    public static boolean isFullyNormalized(String input) {
        // implement normalization logic here
        return true;
    }
}

public class UrlBuilder {

    private java.util.HashMap<String, String> queryParams = new java.util.HashMap<>();

    public void addQuery(String key, String value) {
        queryParams.put(key, value);
    }

    public URL build(String url) {
        // implementation to construct the full URL
        return null;
    }
}

public class DataUtil {

    public static class KeyVal {
        private final String key;
        private final String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            // implementation of equals method
            return false;
        }
    }

    public static void main(String[] args) {
        org.junit.Test
        public void testKeyVal () {
            DataUtil.KeyVal kv1 = new DataUtil.KeyVal("key", "value");
            DataUtil.KeyVal kv2 = new DataUtil.KeyVal("key", "value");
            assertEquals(kv1, kv2);
        }
    }

}