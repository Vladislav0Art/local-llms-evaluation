package org.jsoup.helper;

public class GeneratedNewRequest_ReturnsNewRequest {

    @Test
    public void newRequest_ReturnsNewRequest() {
        Connection request = HttpConnection.newRequest();
        assertNotNull(request);
        assertTrue(request instanceof Request);
    }

}