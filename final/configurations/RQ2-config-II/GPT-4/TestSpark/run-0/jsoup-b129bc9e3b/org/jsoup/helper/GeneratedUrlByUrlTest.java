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

public class GeneratedUrlByUrlTest {

    @Test
    public void urlByUrlTest() {
        String url = "http://example.com";
        HttpConnection conn = new HttpConnection();
        conn.url(url);
        assertEquals(url, conn.request().url().toString());
    }

}