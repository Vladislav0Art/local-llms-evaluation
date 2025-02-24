package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;

public class GeneratedTest {

    private static final String TEST_URL = "http://www.example.com";

    @Test
    public void testGet() throws IOException {
        HttpConnection connection = HttpConnection.connect(TEST_URL);
        Request request = connection.request();
        request.method(HttpConnection.Method.GET);
        Response response = connection.execute();
        Document doc = response.parse();
        assertEquals("Title", doc.title());
    }

    @Test
    public void testPost() throws IOException {
        HttpConnection connection = HttpConnection.connect(TEST_URL);
        Request request = connection.request();
        request.method(HttpConnection.Method.POST);
        Response response = connection.execute();
        Document doc = response.parse();
        assertEquals("Title", doc.title());
    }

    @Test
    public void testExecute() throws IOException {
        HttpConnection connection = HttpConnection.connect(TEST_URL);
        Request request = connection.request();
        Response response = connection.execute();
        assertEquals(200, response.statusCode());
    }

    @Test
    public void testConnect() throws IOException {
        HttpConnection connection = HttpConnection.connect(TEST_URL);
        assertEquals(connection.request().url().toString(), TEST_URL);
    }

    @Test
    public void testRequest() throws IOException {
        HttpConnection connection = HttpConnection.connect(TEST_URL);
        Request request = connection.request();
        assertEquals(request.url().toString(), TEST_URL);
    }

    @Test
    public void testResponse() throws IOException {
        HttpConnection connection = HttpConnection.connect(TEST_URL);
        Response response = connection.response();
        assertEquals(response.statusCode(), 200);
    }

}