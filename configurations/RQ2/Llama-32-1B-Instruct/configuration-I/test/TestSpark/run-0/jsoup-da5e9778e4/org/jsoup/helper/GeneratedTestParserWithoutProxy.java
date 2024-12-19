package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestParserWithoutProxy {

    @Test
    public void testParserWithoutProxy() {
        HttpConnection connection = new HttpConnection();
        Parser parser = new org.jsoup.helper.Parser();
        connection.setParser(parser);
        Request request = new Request();
        String url = "http://example.com";
        Connection response = connection.post(url, null);
        assertNotNull(response);
    }

}