package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedConnectViaURLTest {

    @Test
    public void connectViaURLTest() throws Exception {
        URL url = new URL("https://www.google.com");
        Connection connection = HttpConnection.connect(url);
        Assert.assertNotNull(connection);
    }

}