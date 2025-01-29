package org.jsoup.helper;

public class GeneratedTest_connect_method {

    private static Connection mockHttpConnection = Mockito.mock(Connection.class);

    @Test
    public void test_connect_method() throws MalformedURLException {
        Mockito.when(mockHttpConnection.connect("https://example.com")).thenReturn(new Response(200, "Hello World!", null));
        HttpConnection connection = new HttpConnection();
        assertEquals(Method.POST, connection.method(Method.POST).getCode());
    }

}