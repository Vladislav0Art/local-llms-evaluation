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

public class GeneratedPostTest {

    @Test
    public void postTest() throws IOException {
        Connection.Response response = Jsoup.connect("http://www.httpbin.org/post")
                .data("key", "value")
                .method(Connection.Method.POST)
                .execute();
        Assert.assertNotNull(response);
    }

}