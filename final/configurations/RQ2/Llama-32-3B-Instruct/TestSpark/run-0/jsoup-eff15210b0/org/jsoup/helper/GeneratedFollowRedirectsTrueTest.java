package org.jsoup.helper;

public class GeneratedFollowRedirectsTrueTest {

    @Test
    public void followRedirectsTrueTest() throws IOException {
        assertSame(HttpConnection.followRedirects(true), true);
    }

}