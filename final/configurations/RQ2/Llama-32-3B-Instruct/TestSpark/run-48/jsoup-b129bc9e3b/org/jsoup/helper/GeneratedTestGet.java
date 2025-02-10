package org.jsoup.helper;

public class GeneratedTestGet {

    private String url;
    private Map<String, String> headers;
    private Map<String, String> data;
    private Document document;

    public Connection(String url) {
        this.url = url;
    }

    public Map<String, String> headers(Map<String, String> headers) {
        this.headers = headers;
        return this.headers;
    }

    public Map<String, String> data(Map<String, String> data) {
        this.data = data;
        return this.data;
    }

    public Document get() {
        // Implementation of get method
        return document;
    }

    public Document post() {
        // Implementation of post method
        return document;
    }
}

public class HttpConnection {
    private Connection connection;

    public HttpConnection(String url) {
        this.connection = new Connection(url);
    }

    public Map<String, String> headers(Map<String, String> headers) {
        return this.connection.headers(headers);
    }

    public Map<String, String> data(Map<String, String> data) {
        return this.connection.data(data);
    }

    public Document requestBody(String body) {
        // Implementation of requestBody method
        return document;
    }
}

public class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

public class TestHttpConnection {

    @Test
    public void testGet() {
        Connection connection = new Connection("http://example.com");
        Map<String, String> headers = new HashMap<>();
        headers.put("Accept", "application/json");

        connection.headers(headers);
        Document document = connection.get();
        assertEquals("Hello World!", document.getContent());
    }

}