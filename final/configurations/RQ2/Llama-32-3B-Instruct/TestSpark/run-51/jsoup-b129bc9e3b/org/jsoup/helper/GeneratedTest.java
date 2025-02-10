package org.jsoup.helper;

public class GeneratedTest {

    public static class Connection {
        private String url;

        public Connection(String url) {
            this.url = url;
        }

        public Jsoup.Request request(Method method, String data, String headers) {
            return new Jsoup.Request(url, (requestBuilder) -> {
                requestBuilder.method(method);
                return requestBuilder;
            }, data, "application/x-www-form-urlencoded", headers);
        }
    }

    @FunctionalInterface
    public interface Method {
        default void get() {
        }

        default void post() {
            System.out.println("POST");
        }
    }

    public static class Request {
        private String url;
        private Method method;
        private String data;
        private String headers;

        public Request(String url, Method method, String data, String headers) {
            this.url = url;
            this.method = method;
            this.data = data;
            this.headers = headers;
        }

        public Document execute() throws Exception {
            return new Connection(url).request(method, data, headers).get();
        }
    }

    public static class Document {
        private String html;

        public Document(String html) {
            this.html = html;
        }

        public String getHtml() {
            return html;
        }
    }

    public static Document connect(String url) throws Exception {
        return new Document("html");
    }
}

public class Test {

    @Test
    public void connect_ReturnsNewInstance() throws Exception {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void data_WithKeyValPairs_ReturnsNewInstance() throws Exception {
        Connection connection = new HttpConnection();
        connection.data("key", "value");
        assertNotNull(connection.data());
    }

}