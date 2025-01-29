package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestResponse {

    private HttpConnection connection;
    private URL url;

    @Before
    public void setup() {
        url = new URL("https://example.com");
    }

    @Test
    public void testResponse() throws Exception {
        String responseText = "HTTP/1.1 200 OK\r\nContent-Type: text/html\r\n\r\nHello World!";
        Request request = new Request();
        connection = (HttpConnection) request.get().setEntity(new StringReader(responseText));
        assertEquals("HTTP/1.1 200 OK\r\nContent-Type: text/html\r\n\r\nHello World!", new BufferedReader(new InputStreamReader(connection.response().get()))
        !!.readLine());
    }

}