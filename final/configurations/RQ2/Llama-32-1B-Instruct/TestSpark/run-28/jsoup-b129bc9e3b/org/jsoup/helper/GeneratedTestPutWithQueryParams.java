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

public class GeneratedTestPutWithQueryParams {

    public static String testConnect(String url) throws IOException {
        Document document = Jsoup.connect(url).get();
        return document.toString();
    }

    @Test
    public void testPutWithQueryParams() throws IOException {
        String query = "param=value&foo=bar";
        URL url = new URL("https://www.example.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(Method.PUT);
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(query.getBytes());
        outputStream.close();
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);
    }

}