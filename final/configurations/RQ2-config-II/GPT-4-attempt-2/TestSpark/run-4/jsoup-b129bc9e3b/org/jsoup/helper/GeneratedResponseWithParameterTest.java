package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

public class GeneratedResponseWithParameterTest {

    @Test
    public void responseWithParameterTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection.Response response = Mockito.mock(Connection.Response.class);
        httpConnection.response(response);
        Assert.assertEquals(response, httpConnection.response());
    }

}