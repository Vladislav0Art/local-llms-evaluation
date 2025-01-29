package org.jsoup.helper;

public class GeneratedTest_connect_url {

    private static Connection mockHttpConnection = Mockito.mock(Connection.class);

    @Test
    public void test_connect_url() throws MalformedURLException {
        Mockito.when(mockHttpConnection.connect("https://example.com")).thenReturn(new Response(200, "Hello World!", null));
        HttpConnection connection = new HttpConnection(mockHttpConnection);
        assertEquals(200, connection.url("https://example.com").getCode());
    }

}