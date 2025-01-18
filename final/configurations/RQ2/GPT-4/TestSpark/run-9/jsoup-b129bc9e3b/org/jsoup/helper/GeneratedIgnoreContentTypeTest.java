package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GeneratedIgnoreContentTypeTest {

    @Test
    public void ignoreContentTypeTest() {
        HttpConnection connection = (HttpConnection) HttpConnection.connect("http://www.google.com");
        boolean ignoreContentType = true;
        connection.ignoreContentType(ignoreContentType);
        Assert.assertEquals(connection.request().ignoreContentType(), ignoreContentType);
    }

}