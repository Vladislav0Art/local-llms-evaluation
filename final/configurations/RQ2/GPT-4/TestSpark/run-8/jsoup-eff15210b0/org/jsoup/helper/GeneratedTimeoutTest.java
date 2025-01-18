package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.URL;

public class GeneratedTimeoutTest {

    @Test
    public void timeoutTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.timeout(1000);
        Assert.assertNotNull(connection);
    }

}