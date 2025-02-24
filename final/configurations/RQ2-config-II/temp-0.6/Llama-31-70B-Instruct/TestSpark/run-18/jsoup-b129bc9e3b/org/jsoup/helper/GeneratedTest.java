package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

public class GeneratedTest {

    private HttpConnection httpConnection;
    private Request request;
    private Response response;

    @Before
    public void setUp() {
        httpConnection = new HttpConnection();
        request = Mockito.mock(Request.class);
        response = Mockito.mock(Response.class);
    }

    @Test
    public void testRequest() {
        httpConnection.request(request);
        Assert.assertEquals(request, httpConnection.request());
    }

    @Test
    public void testRequestWithNull() {
        httpConnection.request(null);
        Assert.assertNull(httpConnection.request());
    }

    @Test
    public void testResponse() {
        httpConnection.response(response);
        Assert.assertEquals(response, httpConnection.response());
    }

    @Test
    public void testResponseWithNull() {
        httpConnection.response(null);
        Assert.assertNull(httpConnection.response());
    }

    @Test
    public void testConnect() throws IOException {
        Response response = Mockito.mock(Response.class);
        Mockito.when(httpConnection.execute()).thenReturn(response);

        Response actualResponse = httpConnection.connect(new URL("http://www.example.com")).execute();

        Assert.assertEquals(response, actualResponse);
    }

}