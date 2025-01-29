package org.jsoup.helper;

public class GeneratedTest_url {

    private static final String HOST = "example.com";
    private static final int PORT = 443;

    @Test
    public void test_url() {
        URL url = new URL("https://" + HOST + ":" + PORT);
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
        assertEquals(HOST, connection.getHost());
        assertEquals(PORT, connection.getPort());
    }

}