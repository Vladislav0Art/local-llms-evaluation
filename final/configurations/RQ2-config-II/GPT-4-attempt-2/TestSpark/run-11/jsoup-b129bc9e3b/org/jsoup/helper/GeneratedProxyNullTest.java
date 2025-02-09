package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class GeneratedProxyNullTest {

    @Test
    public void proxyNullTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.proxy((Proxy) null);
        Assert.assertNotNull(connection);
    }

}