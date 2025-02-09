package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.jsoup.helper.HttpConnection;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;
import java.net.MalformedURLException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIgnoreHttpErrorsTest {

    @Test
    public void ignoreHttpErrorsTest() {
        HttpConnection conn = new HttpConnection();
        conn.ignoreHttpErrors(true);
        assertTrue(conn.request().ignoreHttpErrors());
    }

}