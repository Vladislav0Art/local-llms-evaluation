package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.CookieStore;
import java.net.URL;
import java.net.HttpCookie;
import java.util.HashMap;
import java.util.Map;

public class GeneratedExecuteTest {

    @Test
    public void executeTest() throws IOException {
        Connection.Request request = Jsoup.connect("http://www.google.com").request();
        Connection.Response response = request.execute();
        Assert.assertNotNull(response);
    }

}