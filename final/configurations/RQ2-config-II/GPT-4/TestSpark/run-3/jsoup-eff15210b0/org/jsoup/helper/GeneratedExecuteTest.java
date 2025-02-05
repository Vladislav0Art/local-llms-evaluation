package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.internal.ConstrainableInputStream;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.Proxy;
import javax.net.ssl.SSLSocketFactory;

public class GeneratedExecuteTest {

    @Test
    public void executeTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        connection.url("https://github.com/");
        connection.execute();
    }

}