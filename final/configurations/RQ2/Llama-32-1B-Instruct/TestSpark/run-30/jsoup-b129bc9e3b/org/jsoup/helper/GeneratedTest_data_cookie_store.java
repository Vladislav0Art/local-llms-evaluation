package org.jsoup.helper;

public class GeneratedTest_data_cookie_store {

    private static Connection mockHttpConnection = Mockito.mock(Connection.class);

    @Test
    public void test_data_cookie_store() throws MalformedURLException {
        Mockito.when(mockHttpConnection.connect("https://example.com")).thenReturn(new Response(200, "Hello World!", null));
        HttpConnection connection = new HttpConnection();
        assertEquals(1024 * 8, connection.data(null, "cookies", OutputStream.class).getCode());
    }

}