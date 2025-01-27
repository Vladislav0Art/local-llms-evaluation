package org.jsoup.helper;

public class GeneratedFollowRedirectsTest {

    @Test
    public void followRedirectsTest() {
        Connection connection = HttpConnection.connect("https://example.com");
        Connection followRedirects = connection.followRedirects(true);
        assertNotNull(followRedirects);
    }

}