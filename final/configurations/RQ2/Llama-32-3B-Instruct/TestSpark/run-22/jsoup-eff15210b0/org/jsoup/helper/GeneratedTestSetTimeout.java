package org.jsoup.helper;

public class GeneratedTestSetTimeout {

    @Test
    public void testSetTimeout() {
        int millis = 1000;
        Connection connection = HttpConnection.createConnection();
        HttpConnection.setTimeout(millis);
        assertEquals(millis, connection.getTimeout());
    }

}