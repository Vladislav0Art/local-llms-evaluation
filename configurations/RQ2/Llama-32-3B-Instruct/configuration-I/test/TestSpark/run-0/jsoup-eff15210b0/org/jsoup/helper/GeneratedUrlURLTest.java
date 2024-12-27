package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Request;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedUrlURLTest {

    @Test
    public void urlURLTest() {
        URL url = new URL("http://example.com");
        Request request = new Request(url.toString());
        HttpConnection connection = new HttpConnection(request);
        Connection expected = new HttpConnection();
        assertEquals(expected, connection.url(url));
    }

}