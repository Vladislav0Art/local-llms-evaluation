package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedExecuteTest {

    @Test
    public void executeTest() {
        try {
            HttpConnection httpConnection = new HttpConnection();
            httpConnection.url(new URL("http://google.com"));
            Assert.assertNotNull(httpConnection.execute());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

}