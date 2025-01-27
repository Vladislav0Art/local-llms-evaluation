package org.jsoup.helper;

public class GeneratedTimeout_millis {

    @Test
    public void timeout_millis() {
        int millis = 1000;
        assertSame(HttpConnection.class, Connection.timeout(millis).getClass());
    }

}