package org.jsoup.helper;

public class GeneratedTest {

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
    public void testNeedsMultipart() throws Exception {
        Connection.Request request = new Connection.Request();
        Connection.KeyVal keyVal = Connection.KeyVal.create("key", "value");
        request.data().add(keyVal);
        assertTrue(Connection.needsMultipart(request));
    }

    @Test
    public void testNeedsMultipartNoInputStream() throws Exception {
        Connection.Request request = new Connection.Request();
        Connection.KeyVal keyVal = Connection.KeyVal.create("key", "value");
        request.data().add(keyVal);
        assertFalse(Connection.needsMultipart(request));
    }

    @Test
    public void testSerialiseRequestUrl() throws IOException {
        Connection.Request request = new Connection.Request();
        UrlBuilder urlBuilder = new Connection.UrlBuilder();
        urlBuilder.appendKeyVal(Connection.KeyVal.create("key", "value"));
        assertEquals("http://example.com?key=value", request.url(urlBuilder.build()));
    }

    @Test
    public void testWritePost() throws Exception {
        Connection.Request request = new Connection.Request();
        OutputStream outputStream = new ByteArrayOutputStream();
        request.writePost(outputStream);
        // implementation
    }
}

public class UrlBuilderImpl implements Connection.UrlBuilder {
    private String url;

    @Override
    public boolean hasKeyVal() {
        return false;
    }

    @Override
    public void appendKeyVal(Connection.KeyVal keyVal) {
        // implementation
    }

    @Override
    public String build() {
        // implementation
        return "";
    }

    @Override
    public String getKey() {
        // implementation
        return "";
    }
}

public class RequestImpl implements Connection.Request {
    private List<Connection.KeyVal> data = new ArrayList<>();

    @Override
    public String url(UrlBuilder builder) {
        if (builder.hasKeyVal()) {
            return builder.build() + "?key=" + builder.getKey();
        }
        return builder.build();
    }

    @Override
    public OutputStream writePost(OutputStream outputStream) throws Exception {
        // implementation
        return null;
    }
}

public class KeyValImpl implements Connection.KeyVal {
    private String key;

    @Override
    public String key() {
        return key;
    }

    @Override
    public void key(String key) {
        this.key = key;
    }

    @Override
    public String value() {
        // implementation
        return "";
    }

    @Override
    public void value(String value) {
        // implementation
    }
}

public class RequestBodySerializerImpl implements Connection.RequestBodySerializer {
    @Override
    public String serialize(String requestBody) throws Exception {
        // implementation
        return null;
    }

}