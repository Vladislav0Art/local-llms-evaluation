package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedPostTest {

    @Test
    public void postTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        Document document = httpConnection.post();
        assertNotNull(document);
    }

}