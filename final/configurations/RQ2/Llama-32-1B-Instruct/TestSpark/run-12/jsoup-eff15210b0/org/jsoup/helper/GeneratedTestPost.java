package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestPost {

    private HttpConnection connection;
    private URL url;

    @Before
    public void setup() {
        url = new URL("https://example.com");
    }

    @Test
    public void testPost() throws Exception {
        String responseText = "Hello World!";
        Request request = new Request();
        connection = (HttpConnection) request.get().setEntity(new StringReader(responseText));
        assertEquals("Hello World!", new BufferedReader(new InputStreamReader(connection.post().get())) !!.readLine());
    }

}