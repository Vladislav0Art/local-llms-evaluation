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

public class GeneratedHeaderTest {

    @Test
    public void headerTest() {
        HttpConnection connection = (HttpConnection) new HttpConnection().header("key", "value");
        Assert.assertEquals("value", connection.request().header("key"));
    }

}