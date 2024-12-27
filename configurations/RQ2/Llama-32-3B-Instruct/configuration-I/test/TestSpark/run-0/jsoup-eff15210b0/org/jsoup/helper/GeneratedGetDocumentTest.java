package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Request;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetDocumentTest {

    @Test
    public void getDocumentTest() throws IOException {
        String url = "http://example.com";
        Request request = new Request(url, "GET");
        Document document = new Document();
        HttpConnection connection = new HttpConnection(document, request);
        Connection expected = new HttpConnection();
        assertEquals(expected, connection.get());
    }

}