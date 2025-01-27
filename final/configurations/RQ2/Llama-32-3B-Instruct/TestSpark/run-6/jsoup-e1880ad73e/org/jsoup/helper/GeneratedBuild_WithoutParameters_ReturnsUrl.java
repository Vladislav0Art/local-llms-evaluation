package org.jsoup.helper;

public class GeneratedBuild_WithoutParameters_ReturnsUrl {

    public static class Connection {
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

        public static class Base64 {
            public static byte[] getEncoder() {
                return new byte[0];
            }

            public static String encode(String input) {
                // Implement encoding logic here
                return input;
            }

            public static String encodeToString(byte[] bytes) {
                // Implement encoding logic here
                return "";
            }
        }
    }

    @Test
    public void build_WithoutParameters_ReturnsUrl() throws MalformedURLException {
        org.jsoup.helper.Connection.URL url = new org.jsoup.helper.Connection.URL("example.com", 8080);
        assert url.toExternalForm().equals("http://example.com:8080");
    }

}