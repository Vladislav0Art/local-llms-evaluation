package org.jsoup.helper;

public class GeneratedTestReferrer {

    @Test
    public void testReferrer() {
        String referrer = "My Referrer";
        Connection connection = HttpConnection.createConnection();
        HttpConnection.setReferrer(referrer);
        assertEquals(referrer, connection.getReferrer());
    }

}