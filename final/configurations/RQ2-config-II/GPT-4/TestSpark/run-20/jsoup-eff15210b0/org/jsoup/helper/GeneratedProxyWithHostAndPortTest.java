package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedProxyWithHostAndPortTest {

    @Test
    public void proxyWithHostAndPortTest() {
        HttpConnection http = new HttpConnection();
        http.proxy("localhost", 8080);
        Assert.assertEquals(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080)), http.request().proxy());
    }

}