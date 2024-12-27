package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Request;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedExecuteResponseTest {

    @Test
    public void executeResponseTest() throws IOException {
        Request request = new Request("http://example.com");
        Response response = Mockito.mock(Response.class);
        Document document = new Document();
        HttpConnection connection = new HttpConnection(document, request, response);
        Connection expected = new HttpConnection();
        assertEquals(expected, connection.execute());
    }

}