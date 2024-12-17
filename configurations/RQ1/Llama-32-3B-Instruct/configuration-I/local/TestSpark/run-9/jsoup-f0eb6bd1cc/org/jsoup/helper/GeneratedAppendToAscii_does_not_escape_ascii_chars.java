package org.jsoup.helper;

public class GeneratedAppendToAscii_does_not_escape_ascii_chars {

    private URL u;

    public UrlBuilder(URL url) {
        this.u = url;
    }

    public String build() throws URISyntaxException {
        // implementation
    }

    public void appendKeyVal(Connection.KeyVal kv) {
        // implementation
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
            return String.format("%s=%s", key, value);
        }
    }
}

public class GeneratedTest {

    @Test
    public void appendToAscii_does_not_escape_ascii_chars() throws URISyntaxException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        builder.appendToAscii("%C3%A1oth", false, sb);
        assertEquals("%C3%A0th", sb.toString());
    }

}