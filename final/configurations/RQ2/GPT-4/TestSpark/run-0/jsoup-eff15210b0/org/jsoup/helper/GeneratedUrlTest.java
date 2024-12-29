package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.HttpCookie;
import java.util.HashMap;
import java.util.Map;

public class GeneratedUrlTest {

    @Test
    public void urlTest() {
        Connection connection = Jsoup.connect("http://www.google.com").url("http://www.example.com");
        Assert.assertEquals("http://www.example.com", connection.request().url().toString());
    }

}