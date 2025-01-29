package org.jsoup.helper;

public class GeneratedTest_max_body_size_with_invalid_type {

    private static Connection mockHttpConnection = Mockito.mock(Connection.class);

    @Test
    public void test_max_body_size_with_invalid_type() throws MalformedURLException {
        Mockito.when(mockHttpConnection.connect("https://example.com")).thenReturn(new Response(200, "Hello World!", null));
        HttpConnection connection = new HttpConnection();
        assertEquals(-1, connection.maxBodySize(null).getCode());
    }

}