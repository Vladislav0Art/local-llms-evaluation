package org.jsoup.helper;

public class GeneratedTest_connect_user_agent {

    private static Connection mockHttpConnection = Mockito.mock(Connection.class);

    @Test
    public void test_connect_user_agent() throws MalformedURLException {
        Mockito.when(mockHttpConnection.connect("https://example.com")).thenThrow(new IOException()).thenReturn(new Response(200, "Hello World!", null));
        HttpConnection connection = new HttpConnection();
        assertEquals("User-Agent: unknown", connection.userAgent(null).get());
    }

}