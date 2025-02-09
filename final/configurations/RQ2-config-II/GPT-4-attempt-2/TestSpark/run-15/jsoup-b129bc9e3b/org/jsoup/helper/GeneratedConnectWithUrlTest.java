package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedConnectWithUrlTest {

    @Test
    public void connectWithUrlTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        Assert.assertNotNull(connection);
    }

}