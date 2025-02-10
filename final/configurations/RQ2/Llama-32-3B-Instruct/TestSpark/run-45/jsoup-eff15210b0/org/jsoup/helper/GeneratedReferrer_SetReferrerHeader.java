package org.jsoup.helper;

public class GeneratedReferrer_SetReferrerHeader {

    @Test
    public void referrer_SetReferrerHeader() {
        String referrer = "https://www.example.com";
        Connection connection = HttpConnection.referrer(referrer);
        assertNotNull(connection);
        assertTrue(connection instanceof Request);
    }

}