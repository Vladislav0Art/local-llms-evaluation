package org.jsoup.helper;

public class GeneratedTest {

    private String method;
    private String url;

    public Request(String method, String url) {
        this.method = method;
        this.url = url;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

public class Headers {
    private Map<String, String> headers;

    public Headers() {
        this.headers = new HashMap<>();
    }

    public void putHeader(String key, String value) {
        headers.put(key, value);
    }

    public Map<String, String> getHeaders() {
        return headers;
    }
}

public class Response {
    private int statusCode;

    public Response(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}

public class TestRequest {

}