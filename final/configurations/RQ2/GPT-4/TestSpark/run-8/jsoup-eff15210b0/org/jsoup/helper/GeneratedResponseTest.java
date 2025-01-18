package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.URL;

public class GeneratedResponseTest {

    @Test
    public void responseTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection.Response response = httpConnection.response();
        Assert.assertNotNull(response);
    }

}