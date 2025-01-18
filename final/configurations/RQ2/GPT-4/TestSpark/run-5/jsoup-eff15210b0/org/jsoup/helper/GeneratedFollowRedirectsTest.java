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

public class GeneratedFollowRedirectsTest {

    @Test
    public void followRedirectsTest() {
        HttpConnection httpConnection = new HttpConnection();
        boolean followRedirects = false;
        Assert.assertEquals(followRedirects, httpConnection.followRedirects(followRedirects).request().followRedirects());
    }

}