package org.jsoup.helper;

public class GeneratedTestConnect_Implementation_MockCookiesStore {

    @Test
    public void testConnect_Implementation_MockCookiesStore() {
        mockHttpConnection();
        HttpConnection httpConnection = new HttpConnection();
        assertNotSame(httpConnection, null);
        assertEquals("mocked-url", httpConnection.get().getCookieStore().toString());
    }

    private void mockHttpConnection() {
        URL url = new URL("http://example.com");
        HttpConnection connection = new HttpConnection(url);
        Connection.Request request = new Request();
        MockitoAnnotations.initMocks(this);
        connection.setRequest(request);
        assertNotNull(connection);
    }

}