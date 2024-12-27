package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Request;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConnectUAStringTest {

    @Test
    public void connectUAStringTest() {
        String userAgent = "Mozilla/5.0";
        Request request = new Request("http://example.com");
        HttpConnection connection = new HttpConnection(request, userAgent);
        Connection expected = new HttpConnection();
        assertEquals(expected, connection.userAgent(userAgent));
    }

}