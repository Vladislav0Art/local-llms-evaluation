package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Request;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConnectDirectUrlTest {

    @Test
    public void connectDirectUrlTest() {
        Request request = new Request("http://example.com");
        HttpConnection connection = new HttpConnection(request);
        Connection expected = new HttpConnection();
        assertEquals(expected, connection.connect());
    }

}