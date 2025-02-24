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

public class GeneratedTestRequestWithNull {

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
    public void testRequestWithNull() {
        httpConnection.request(null);
        Assert.assertNull(httpConnection.request());
    }

}