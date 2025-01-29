package org.jsoup.helper;

public class GeneratedTest_connect_follow_redirects {

    private static Connection mockHttpConnection = Mockito.mock(Connection.class);

    @Test
    public void test_connect_follow_redirects() throws MalformedURLException {
        Mockito.when(mockHttpConnection.connect("https://example.com")).thenReturn(new Response(200, "Hello World!", null));
        HttpConnection connection = new HttpConnection();
        assertEquals(true, connection.followRedirects(true).getCode());
    }

}