package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedUrlURLTest {

    @Test
    public void urlURLTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        Assert.assertEquals(connection, connection.url(new URL("https://www.example.com")));
    }

}