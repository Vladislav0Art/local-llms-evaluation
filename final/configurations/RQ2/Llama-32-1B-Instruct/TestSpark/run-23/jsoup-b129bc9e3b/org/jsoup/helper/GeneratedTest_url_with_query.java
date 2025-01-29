package org.jsoup.helper;

public class GeneratedTest_url_with_query {

    private static final String HOST = "example.com";
    private static final int PORT = 443;

    @Test
    public void test_url_with_query() {
        URL url = new URL("https://www.example.com?param1=value1&param2=value2");
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
        assertEquals(HOST, connection.getHost());
        assertEquals(PORT, connection.getPort());
        assertEquals("param1=value1", connection.getQuery());
    }

}