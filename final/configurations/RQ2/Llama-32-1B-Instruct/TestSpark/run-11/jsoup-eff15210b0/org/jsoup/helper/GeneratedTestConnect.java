package org.jsoup.helper;

public class GeneratedTestConnect {

    @Test
    public void testConnect() throws Exception {
        HttpConnection connection = new HttpConnection(Request.empty());
        assert connection != null;

        connection.connect("http://example.com");
        assert connection != null;
    }

}