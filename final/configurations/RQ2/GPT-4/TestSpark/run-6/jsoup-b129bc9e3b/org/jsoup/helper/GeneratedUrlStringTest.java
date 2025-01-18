package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

import static org.junit.Assert.*;

public class GeneratedUrlStringTest {

    @Test
    public void urlStringTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection = (HttpConnection) httpConnection.url("http://example.com");
        assertNotNull(httpConnection);
    }

}