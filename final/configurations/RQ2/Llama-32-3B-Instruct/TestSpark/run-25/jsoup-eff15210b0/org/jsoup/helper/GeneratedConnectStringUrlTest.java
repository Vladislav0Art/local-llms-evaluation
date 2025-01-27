package org.jsoup.helper;

public class GeneratedConnectStringUrlTest {

    @Test
    public void connectStringUrlTest() {
        Connection connection = HttpConnection.connect("https://example.com");
        assertNotNull(connection);
    }

}