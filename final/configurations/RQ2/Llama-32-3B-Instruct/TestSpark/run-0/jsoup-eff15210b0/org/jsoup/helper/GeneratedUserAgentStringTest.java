package org.jsoup.helper;

public class GeneratedUserAgentStringTest {

    @Test
    public void userAgentStringTest() {
        assertSame(HttpConnection.userAgent("test"), "test");
    }

}