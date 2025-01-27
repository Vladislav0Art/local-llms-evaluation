package org.jsoup.helper;

public class GeneratedFollowRedirects[Boolean]

Test {

    @Test
    public void followRedirects[ Boolean]Test() {
        boolean followRedirects = true;
        Connection connection = HttpConnection.followRedirects(followRedirects);
        assertNotNull(connection);
    }

}