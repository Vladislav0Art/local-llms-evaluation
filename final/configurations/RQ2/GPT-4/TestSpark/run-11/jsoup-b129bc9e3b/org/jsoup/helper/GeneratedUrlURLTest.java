package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedUrlURLTest {

    @Test
    public void urlURLTest() throws Exception {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(new URL("http://example.com"));
    }

}