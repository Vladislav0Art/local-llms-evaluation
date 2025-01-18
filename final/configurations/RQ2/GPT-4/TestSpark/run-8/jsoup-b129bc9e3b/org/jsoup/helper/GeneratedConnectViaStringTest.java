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

public class GeneratedConnectViaStringTest {

    @Test
    public void connectViaStringTest() {
        Connection connection = HttpConnection.connect("https://www.google.com");
        Assert.assertNotNull(connection);
    }

}