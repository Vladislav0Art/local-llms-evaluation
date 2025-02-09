package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedPostTest {

    @Test
    public void postTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();

        httpConnection.url("http://httpbin.org/post")
                .ignoreContentType(true)
                .data("key", "value")
                .method(Connection.Method.POST);

        Document doc = httpConnection.post();

        assertTrue(doc.text().contains("value"));
    }

}