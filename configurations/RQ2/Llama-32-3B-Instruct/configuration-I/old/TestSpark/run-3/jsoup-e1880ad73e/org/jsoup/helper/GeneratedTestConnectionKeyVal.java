package org.jsoup.helper;

public class GeneratedTestConnectionKeyVal {

    private URL url;

    public UrlBuilder(URL url) {
        this.url = url;
    }

    public URL getUrl() {
        return url;
    }
}

public class Connection {
    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "(" + key + ", " + value + ")";
        }
    }
}

public class GeneratedTest {

    @Test
    public void testConnectionKeyVal() {
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
        String keyValStr = keyVal.toString();
        assertEquals("(key, value)", keyValStr);
    }

}