package org.jsoup.helper;

public class GeneratedTestSerialiseRequestUrl {

    public static class Request {
        private List<Connection.KeyVal> data = new ArrayList<>();

        public String url(UrlBuilder builder) {
            if (builder.hasKeyVal()) {
                return builder.build() + "?key=" + builder.getKey();
            }
            return builder.build();
        }

        public OutputStream writePost(OutputStream outputStream) throws Exception {
            // implementation
            return null;
        }
    }

    public static interface KeyVal {
        String key();

        void key(String key);

        String value();

        void value(String value);
    }

    public static class RequestBodySerializer implements RequestBodySerializer {
        @Override
        public String serialize(Connection.Request request) throws Exception {
            // implementation
            return null;
        }
    }

    public interface RequestBodySerializer {
        String serialize(String requestBody) throws Exception;
    }

    public static class UrlBuilder {
        private String url;

        public boolean hasKeyVal() {
            // implementation
            return false;
        }

        public void appendKeyVal(Connection.KeyVal keyVal) {
            // implementation
        }

        public String build() {
            // implementation
            return "";
        }

        public String getKey() {
            // implementation
            return "";
        }
    }
}

public class ConnectionTest {

    @Test
    public void testSerialiseRequestUrl() throws IOException {
        Connection.Request request = new Connection.Request();
        UrlBuilder urlBuilder = new Connection.UrlBuilder();
        urlBuilder.appendKeyVal(Connection.KeyVal.create("key", "value"));
        assertEquals("http://example.com?key=value", request.url(urlBuilder.build()));
    }

}