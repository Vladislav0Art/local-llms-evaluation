package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedUrlStringVerifyTest {

    @Test
    public void urlStringVerifyTest() throws MalformedURLException {
        HttpConnection connection = new HttpConnection();
        Connection.Response response = connection.url("http://example.com").execute();
        assertEquals("http://example.com", response.url().toString());
    }

}