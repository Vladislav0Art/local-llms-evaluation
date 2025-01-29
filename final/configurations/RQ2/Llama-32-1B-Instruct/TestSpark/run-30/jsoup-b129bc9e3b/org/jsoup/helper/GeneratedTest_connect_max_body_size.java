package org.jsoup.helper;

public class GeneratedTest_connect_max_body_size {

    private static Connection mockHttpConnection = Mockito.mock(Connection.class);

    @Test
    public void test_connect_max_body_size() throws MalformedURLException {
        Mockito.when(mockHttpConnection.connect("https://example.com")).thenReturn(new Response(200, "Hello World!", null));
        HttpConnection connection = new HttpConnection();
        assertEquals(1024 * 8, connection.maxBodySize(8).getCode());
    }

}