package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.URL;

public class GeneratedExecuteTest {

    @Test
    public void executeTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("http://example.com");
        Connection.Response response = httpConnection.execute();
        Assert.assertNotNull(response);
    }

}