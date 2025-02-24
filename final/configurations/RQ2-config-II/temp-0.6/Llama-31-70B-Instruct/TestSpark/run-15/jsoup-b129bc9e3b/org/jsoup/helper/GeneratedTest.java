package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testGet() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        Response response = httpConnection.get();
        assertEquals(200, response.statusCode());
    }

    @Test
    public void testPost() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        Response response = httpConnection.post();
        assertEquals(200, response.statusCode());
    }

    @Test
    public void testExecute() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        Response response = httpConnection.execute();
        assertEquals(200, response.statusCode());
    }

    @Test
    public void testRequest() {
        HttpConnection httpConnection = new HttpConnection();
        assertEquals(httpConnection.request(), httpConnection.request());
    }

    @Test
    public void testResponse() {
        HttpConnection httpConnection = new HttpConnection();
        assertEquals(httpConnection.response(), httpConnection.response());
    }

    @Test
    public void testPostDataCharset() {
        HttpConnection httpConnection = new HttpConnection();
        assertEquals("UTF-8", httpConnection.postDataCharset());
    }

}