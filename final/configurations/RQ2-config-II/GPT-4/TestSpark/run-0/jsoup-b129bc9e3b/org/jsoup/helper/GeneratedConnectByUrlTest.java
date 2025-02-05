package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedConnectByUrlTest {

    @Test
    public void connectByUrlTest() {
        String url = "http://example.com";
        HttpConnection connect = (HttpConnection) HttpConnection.connect(url);
        assertEquals(url, connect.request().url().toString());
    }

}