package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedFollowRedirectsTest {

    @Test
    public void followRedirectsTest() {
        Connection connection = new HttpConnection().followRedirects(true);
        assertTrue(connection.request().followRedirects());
    }

}