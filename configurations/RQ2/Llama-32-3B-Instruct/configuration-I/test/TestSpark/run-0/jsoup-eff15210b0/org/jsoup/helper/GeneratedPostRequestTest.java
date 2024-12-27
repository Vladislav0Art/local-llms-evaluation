package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Request;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedPostRequestTest {

    @Test
    public void postRequestTest() throws IOException {
        Request request = new Request("POST", "http://example.com");
        Document document = new Document();
        HttpConnection connection = new HttpConnection(document, request);
        Connection expected = new HttpConnection();
        assertEquals(expected, connection.post());
    }

}