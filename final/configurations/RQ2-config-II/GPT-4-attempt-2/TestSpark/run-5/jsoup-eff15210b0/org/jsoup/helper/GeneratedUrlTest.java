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

public class GeneratedUrlTest {

    @Test
    public void urlTest() {
        HttpConnection httpConnection = new HttpConnection();

        httpConnection.url("http://www.google.com");

        assertEquals("http://www.google.com", httpConnection.request().url().toString());
    }

}