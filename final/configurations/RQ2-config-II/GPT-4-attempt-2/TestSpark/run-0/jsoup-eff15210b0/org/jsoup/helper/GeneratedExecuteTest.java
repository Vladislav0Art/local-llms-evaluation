package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

public class GeneratedExecuteTest {

    @Test
    public void executeTest() throws IOException {
        String url = "http://example.com";
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(url);
        httpConnection.execute();
    }

}