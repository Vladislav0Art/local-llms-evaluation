package org.jsoup.helper;

public class GeneratedTest HttpRequest {

    private String url;
    private String requestBody;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    public HttpResponse post() {
        // implementation of POST request
        return new HttpResponse("testResponse");
    }
}

public class HttpResponse {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

public class Response {
    private HttpResponse response;

    public Response(HttpResponse response) {
        this.response = response;
    }

    public HttpResponse getResponse() {
        return response;
    }
}

public class Document {
    public void setContent(String content) {
        // implementation of setting content
    }
}

public class RequestBody {
    private String content;

    public RequestBody(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

public class TestHttpRequest {

    @Test
    public void test

    HttpRequest() {
        HttpRequest request = new HttpRequest();
        request.setUrl("http://example.com");
        request.setRequestBody("testRequest");

        HttpResponse response = request.post().getResponse();
        Document document = new Document();
        document.setContent(response.getContent());

        assertEquals("testResponse", document.getContent());
    }
}

}