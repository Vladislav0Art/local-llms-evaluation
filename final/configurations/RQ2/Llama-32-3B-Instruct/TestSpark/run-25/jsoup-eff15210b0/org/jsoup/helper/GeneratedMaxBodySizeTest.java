package org.jsoup.helper;

public class GeneratedMaxBodySizeTest {

    @Test
    public void maxBodySizeTest() {
        Connection connection = HttpConnection.connect("https://example.com");
        Connection maxBodySize = connection.maxBodySize(1024);
        assertNotNull(maxBodySize);
    }

}