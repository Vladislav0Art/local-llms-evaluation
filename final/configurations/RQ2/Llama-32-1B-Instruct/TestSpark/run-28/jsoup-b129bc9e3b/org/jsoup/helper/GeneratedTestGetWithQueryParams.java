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

public class GeneratedTestGetWithQueryParams {

    public static String testConnect(String url) throws IOException {
        Document document = Jsoup.connect(url).get();
        return document.toString();
    }

    @Test
    public void testGetWithQueryParams() throws IOException {
        String query = "param=value&foo=bar";
        URL url = new URL("https://www.example.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(Method.GET);
        connection.setDoOutput(true);
        connection.setDoInput(true);
        byte[] data = url.openStream().readAllBytes();
        String response = new String(data, "UTF-8");
        System.out.println(response);
    }

}