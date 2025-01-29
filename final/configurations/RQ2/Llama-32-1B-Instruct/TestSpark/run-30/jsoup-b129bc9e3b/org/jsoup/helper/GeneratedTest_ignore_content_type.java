package org.jsoup.helper;

public class GeneratedTest_ignore_content_type {

    private static Connection mockHttpConnection = Mockito.mock(Connection.class);

    @Test
    public void test_ignore_content_type() throws MalformedURLException {
        Mockito.when(mockHttpConnection.connect("https://example.com")).thenThrow(new IOException()).thenReturn(new Response(200, "Hello World!", null));
        HttpConnection connection = new HttpConnection();
        assertEquals(true, connection.ignoreContentType(false).getCode());
    }

}