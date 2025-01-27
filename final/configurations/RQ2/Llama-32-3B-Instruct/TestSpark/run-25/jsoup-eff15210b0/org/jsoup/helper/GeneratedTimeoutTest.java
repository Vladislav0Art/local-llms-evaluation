package org.jsoup.helper;

public class GeneratedTimeoutTest {

    @Test
    public void timeoutTest() {
        Connection connection = HttpConnection.connect("https://example.com");
        Connection timeout = connection.timeout(1000);
        assertNotNull(timeout);
    }

}