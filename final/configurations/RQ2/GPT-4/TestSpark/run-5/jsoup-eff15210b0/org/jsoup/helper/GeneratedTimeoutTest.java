package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTimeoutTest {

    @Test
    public void timeoutTest() {
        HttpConnection httpConnection = new HttpConnection();
        int timeout = 5000;
        Assert.assertEquals(timeout, httpConnection.timeout(timeout).request().timeout());
    }

}