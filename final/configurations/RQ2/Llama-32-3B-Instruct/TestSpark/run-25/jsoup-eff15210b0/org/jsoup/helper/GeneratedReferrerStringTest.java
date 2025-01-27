package org.jsoup.helper;

public class GeneratedReferrerStringTest {

    @Test
    public void referrerStringTest() {
        Connection connection = HttpConnection.connect("https://example.com");
        Connection referrer = connection.referrer("https://referrer.com");
        assertNotNull(referrer);
    }

}