package org.jsoup.helper;

public class GeneratedTest_connect {

    private static final String HOST = "example.com";
    private static final int PORT = 443;

    @Test
    public void test_connect() {
        Connection connection = HttpConnection.connect("https://www.example.com");
        assertNotNull(connection);
        assertEquals(HOST, connection.getHost());
        assertEquals(PORT, connection.getPort());
    }

}