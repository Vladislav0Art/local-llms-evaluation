package org.jsoup.helper;

import org.hamcrest.Matchers;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedConnectURLTest {

    @Test
    public void connectURLTest() throws IOException {
        URL url = new URL("http://www.google.com");
        Connection connection = HttpConnection.connect(url);
        Assert.assertThat(connection, Matchers.instanceOf(HttpConnection.class));
        Assert.assertNotNull(connection);
    }

}