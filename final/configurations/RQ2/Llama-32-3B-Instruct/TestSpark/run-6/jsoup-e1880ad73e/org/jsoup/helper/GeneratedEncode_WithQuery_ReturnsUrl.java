package org.jsoup.helper;

public class GeneratedEncode_WithQuery_ReturnsUrl {

    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public static Connection.KeyVal of(String key, String value) {
            return new Connection.KeyVal(key, value);
        }
    }

    public static class URLUtil {
        public static String encode_WithQuery(String query) throws UnsupportedEncodingException {
            // Implement encoding logic here
            return query;
        }

        public static void appendKeyVal(URL url, Connection.KeyVal keyVal) {
            String encodedKey = Base64.getEncoder().encodeToString(keyVal.key.getBytes());
            String encodedQuery = Base64.getEncoder().encodeToString(keyVal.value.getBytes());

            url.setPath(url.getPath() + "?" + encodedQuery);
        }
    }

    public static class URL {
        private String host;
        private int port;
        private String path;

        public URL(String host, int port) {
            this.host = host;
            this.port = port;
        }

        public void setPath(String path) {
            this.path = path;
        }

        @Override
        public String toExternalForm() {
            return "http://" + host + ":" + port + "/" + path;
        }
    }
}

public class GeneratedTest {

    @Test
    public void encode_WithQuery_ReturnsUrl() throws UnsupportedEncodingException {
        String query = Connection.URLUtil.encode_WithQuery("query=eyJhbGciOiJlZGVuYXV0aCIsIm9hdXMiOnsiYXRva2luIjoiMSIsIm1ldmVudHMiOHRvIiwiY3RvcyI6MCwicmVzcGluZWQiLCJuYXRvcml0eSI6MDt9");
        URL url = new Connection.URL("example.com", 8080);
        Connection.URLUtil.appendKeyVal(url, Connection.KeyVal.of("", query));
        assert url.toExternalForm().equals("http://example.com:8080?query=eyJhbGciOiJlZGVuYXV0aCIsIm9hdXMiOnsiYXRva2luIjoiMSIsIm1ldmVudHMiOHRvIiwiY3RvcyI6MCwicmVzcGluZWQiLCJuYXRvcml0eSI6MDt9");
    }

}