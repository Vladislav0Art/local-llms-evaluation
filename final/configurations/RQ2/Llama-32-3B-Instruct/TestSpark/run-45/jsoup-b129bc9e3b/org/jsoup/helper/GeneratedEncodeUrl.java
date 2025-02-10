package org.jsoup.helper;

public class GeneratedEncodeUrl {

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
    public void encodeUrl() throws Exception {
        // given
        URL u = new URL("http://example.com");

        // when and then
        String encoded = HttpConnection.encodeUrl(u);
        assertNotEquals(u.toString(), encoded);
    }

}