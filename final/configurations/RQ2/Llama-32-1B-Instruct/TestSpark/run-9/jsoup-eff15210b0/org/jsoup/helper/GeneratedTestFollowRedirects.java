package org.jsoup.helper;

public class GeneratedTestFollowRedirects {

    @Test
    public void testFollowRedirects() {
        TestHttpConnection connection = new TestHttpConnection();
        assertTrue(connection.followRedirects(true));
    }

}