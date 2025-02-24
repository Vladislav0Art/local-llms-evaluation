package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestNewRequest {

    @Test
    public void testNewRequest() {
        HttpConnection httpConnection = new HttpConnection();
        Request request = Mockito.mock(Request.class);
        httpConnection.request(request);
        assertEquals(request, httpConnection.request());
    }

}