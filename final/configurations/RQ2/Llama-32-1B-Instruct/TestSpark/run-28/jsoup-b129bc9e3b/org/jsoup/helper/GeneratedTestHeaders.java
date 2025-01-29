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

public class GeneratedTestHeaders {

    public static String testConnect(String url) throws IOException {
        Document document = Jsoup.connect(url).get();
        return document.toString();
    }

    @Test
    public void testHeaders() throws IOException {
        Response response = new Response().response(new Response.ResponseBuilder()
                .addHeader("Content-Type", "application/json")
                .setBody(200, new String[]{"OK"}, new String[]{"data1", "data2"}).build());
        System.out.println(response);
    }

}