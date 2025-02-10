package org.jsoup.helper;

public class GeneratedUrl {

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
    public void url() throws Exception {
        // given
        String url = "http://example.com";
        Connection connection = null;
        URL u = null;

        // when
        connection.url(url);

        // then
        assertEquals(u, connection.url(u));
    }

}