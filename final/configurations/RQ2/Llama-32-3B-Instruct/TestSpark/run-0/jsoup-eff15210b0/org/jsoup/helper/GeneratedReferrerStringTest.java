package org.jsoup.helper;

public class GeneratedReferrerStringTest {

    @Test
    public void referrerStringTest() {
        assertSame("test", HttpConnection.referrer("test"));
    }

}