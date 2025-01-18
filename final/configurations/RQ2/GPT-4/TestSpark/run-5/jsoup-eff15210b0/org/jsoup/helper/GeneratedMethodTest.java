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

public class GeneratedMethodTest {

    @Test
    public void methodTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection.Method method = Connection.Method.POST;
        Assert.assertEquals(method, httpConnection.method(method).request().method());
    }

}