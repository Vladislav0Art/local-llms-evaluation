package org.jsoup.helper;

public class GeneratedFollowRedirects_SetFollowRedirects {

    @Test
    public void followRedirects_SetFollowRedirects() {
        boolean followRedirects = true;
        Connection connection = HttpConnection.followRedirects(followRedirects);
        assertNotNull(connection);
        assertTrue(connection instanceof Request);
    }

}