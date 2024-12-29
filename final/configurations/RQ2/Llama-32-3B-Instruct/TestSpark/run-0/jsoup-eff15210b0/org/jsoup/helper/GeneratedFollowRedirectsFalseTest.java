package org.jsoup.helper;

public class GeneratedFollowRedirectsFalseTest {

    @Test
    public void followRedirectsFalseTest() throws IOException {
        assertSame(HttpConnection.followRedirects(false), false);
    }

}