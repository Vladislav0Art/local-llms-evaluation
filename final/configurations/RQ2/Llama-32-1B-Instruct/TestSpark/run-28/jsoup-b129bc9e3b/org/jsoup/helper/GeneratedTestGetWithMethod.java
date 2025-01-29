package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

import java.io.ByteArrayInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTestGetWithMethod {

    public static String testConnect(String url) throws IOException {
        Document document = Jsoup.connect(url).get();
        return document.toString();
    }

    @Test
    public void testGetWithMethod() throws IOException {
        String response = new Response().response(new Response.ResponseBuilder()
                .build(200, "OK", Collections.singletonMap("header1", "value1"), Collections.singletonMap("header2", "value2"))
                .setMethod(Method.HEAD)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "text/plain")).get();
        System.out.println(response);
    }

}