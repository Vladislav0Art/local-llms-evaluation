package org.jsoup.helper;

public class GeneratedHeaders_Map {

    @Test
    public void headers_Map() {
        Map<String, String> headers = Collections.singletonMap("key", "value");
        assertSame(HttpConnection.class, Connection.headers(headers).getClass());
    }

}