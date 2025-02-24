package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;

public class GeneratedTestPost {

    private static final String TEST_URL = "http://www.example.com";

    @Test
    public void testPost() throws IOException {
        HttpConnection connection = HttpConnection.connect(TEST_URL);
        Request request = connection.request();
        request.method(HttpConnection.Method.POST);
        Response response = connection.execute();
        Document doc = response.parse();
        assertEquals("Title", doc.title());
    }

}