package org.jsoup.helper;

public class GeneratedTestRequest {

    @Test
    public void testRequest() {
        TestHttpConnection connection = new TestHttpConnection();
        Connection request = connection.request(Request.newBuilder().build());
        assertEquals(request, connection.request(request));
    }

}