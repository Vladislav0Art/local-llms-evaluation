package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDataMultipleParametersTest {

    @Test
    public void dataMultipleParametersTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection httpConnectionData = httpConnection.data("key", "value", "key2", "value2");
        Assert.assertNotNull(httpConnectionData);
    }

}