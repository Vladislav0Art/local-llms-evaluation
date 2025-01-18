package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.URL;

public class GeneratedRequestTest {

    @Test
    public void requestTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection.Request request = httpConnection.request();
        Assert.assertNotNull(request);
    }

}