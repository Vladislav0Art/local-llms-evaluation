package org.jsoup.helper;

public class GeneratedNewRequest {

    private String body;

    public HttpConnectionRequest(String body) {
        this.body = body;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HttpConnectionRequest that = (HttpConnectionRequest) o;
        return body != null ? body.equals(that.body) : that.body == null;
    }

    public int hashCode() {
        return body != null ? body.hashCode() : 0;
    }
}

public class HttpConnectionResponse {
    private String body;

    public HttpConnectionResponse(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}

public class HttpConnectionTest {

    @Test
    public void newRequest() throws Exception {
        // given
        Connection connection = null;

        // when and then
        Connection result = connection.newRequest();
        assertNotNull(result);
    }

}