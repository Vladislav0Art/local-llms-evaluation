package org.jsoup.helper;

public class GeneratedTest_data_cookie_store_with_non_existent_url_and_invalid_type {

    private static Connection mockHttpConnection = Mockito.mock(Connection.class);

    @Test
    public void test_data_cookie_store_with_non_existent_url_and_invalid_type() throws MalformedURLException {
        Mockito.when(mockHttpConnection.connect("https://non_existent_url")).thenReturn(new Response(200, "Hello World!", null));
        HttpConnection connection = new HttpConnection();
        assertEquals(-1, connection.data(null, "invalid_type", OutputStream.class).getCode());
    }

}