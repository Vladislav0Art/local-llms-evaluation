package org.jsoup.helper;

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() {
        Connection connection = HttpConnection.connect("https://example.com");
        Connection userAgent = connection.userAgent("Mozilla/5.0");
        assertNotNull(userAgent);
    }

}