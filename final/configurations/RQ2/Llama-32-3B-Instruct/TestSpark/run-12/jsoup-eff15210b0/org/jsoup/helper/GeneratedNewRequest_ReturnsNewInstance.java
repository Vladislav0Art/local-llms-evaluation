package org.jsoup.helper;

public class GeneratedNewRequest_ReturnsNewInstance {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void newRequest_ReturnsNewInstance() {
        Request request = new Request();
        Connection response = HttpConnection.newRequest().request(request);
        assertNotNull(response);
    }

}