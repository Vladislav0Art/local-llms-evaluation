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

public class GeneratedGetTest {

    @Test
    public void getTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();

        httpConnection.url("http://www.google.com");

        Document doc = httpConnection.get();

        assertEquals("Google", doc.title());
    }

}