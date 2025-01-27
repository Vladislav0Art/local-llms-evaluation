package org.jsoup.helper;

public class GeneratedTestRequest {

    private String method;
    private String url;
    private Map<String, String> headers;

    public Request(String method, String url) {
        this.method = method;
        this.url = url;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }
}

public class TestRequest {

    @Test
    public void testRequest() {
        Request request = new Request("GET", "https://www.example.com");
        assertEquals("GET", request.getMethod());
        assertEquals("https://www.example.com", request.getUrl());

        Map<String, String> headers = new HashMap<>();
        headers.put("Accept", "application/json");
        request.setHeaders(headers);
        assertEquals(headers, request.getHeaders());

        assertEquals(200, request.getStatusCode()); // method not implemented in Request class
    }
}

}