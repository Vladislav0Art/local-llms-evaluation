package org.jsoup.helper;

public class GeneratedTimeout_SetTimeout {

    @Test
    public void timeout_SetTimeout() {
        int millis = 10000;
        Connection connection = HttpConnection.timeout(millis);
        assertNotNull(connection);
        assertTrue(connection instanceof Request);
    }

}