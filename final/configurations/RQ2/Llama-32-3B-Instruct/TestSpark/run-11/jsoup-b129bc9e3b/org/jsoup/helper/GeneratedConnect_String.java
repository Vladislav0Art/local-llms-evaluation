package org.jsoup.helper;

public class GeneratedConnect_String {

    @Test
    public void connect_String() {
        String url = "http://example.com";
        assertSame(HttpConnection.class, Connection.connect(url).getClass());
    }

}