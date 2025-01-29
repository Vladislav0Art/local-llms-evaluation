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

public class GeneratedTest {

    public static String testConnect(String url) throws IOException {
        Document document = Jsoup.connect(url).get();
        return document.toString();
    }

    @Test
    public void testGetMethod() throws IOException {
        String response = testConnect("https://www.example.com");
        System.out.println(response);
    }

    @Test
    public void testGetWithBody() throws IOException {
        Response response = new Response().response(new Response.ResponseBuilder()
                .build(200, "OK", Collections.singletonMap("header1", "value1"), Collections.singletonMap("header2", "value2"))
                .setMethod(Method.GET)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "text/plain")).get();
        System.out.println(response);
    }

    @Test
    public void testPostMethod() throws IOException {
        Response response = new Response().response(new Response.ResponseBuilder()
                .build(200, "OK", Collections.singletonMap("header1", "value1"), Collections.singletonMap("header2", "value2"))
                .setMethod(Method.POST)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "text/plain")).get();
        System.out.println(response);
    }

    @Test
    public void testDeleteMethod() throws IOException {
        Response response = new Response().response(new Response.ResponseBuilder()
                .build(200, "OK", Collections.singletonMap("header1", "value1"), Collections.singletonMap("header2", "value2"))
                .setMethod(Method.DELETE)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "text/plain")).get();
        System.out.println(response);
    }

    @Test
    public void testPatchMethod() throws IOException {
        Response response = new Response().response(new Response.ResponseBuilder()
                .build(200, "OK", Collections.singletonMap("header1", "value1"), Collections.singletonMap("header2", "value2"))
                .setMethod(Method.PATCH)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "text/plain")).get();
        System.out.println(response);
    }

    @Test
    public void testPutMethod() throws IOException {
        Response response = new Response().response(new Response.ResponseBuilder()
                .build(200, "OK", Collections.singletonMap("header1", "value1"), Collections.singletonMap("header2", "value2"))
                .setMethod(Method.PUT)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "text/plain")).get();
        System.out.println(response);
    }

    @Test
    public void testPutWithBody() throws IOException {
        Response response = new Response().response(new Response.ResponseBuilder()
                        .build(200, "OK", Collections.singletonMap("header1", "value1"), Collections.singletonMap("header2", "value2"))
                        .setMethod(Method.PUT)
                        .addHeader("Content-Type", "application/json")
                        .addHeader("Accept", "text/plain"))
                .addBody(new RequestBody().request("POST", "/path", Collections.singletonMap("body", Arrays.asList("json1")))))
		.get();
        System.out.println(response);
    }

    @Test
    public void testPatchWithBody() throws IOException {
        Response response = new Response().response(new Response.ResponseBuilder()
                        .build(200, "OK", Collections.singletonMap("header1", "value1"), Collections.singletonMap("header2", "value2"))
                        .setMethod(Method.PATCH)
                        .addHeader("Content-Type", "application/json")
                        .addHeader("Accept", "text/plain"))
                .addBody(new RequestBody().request("POST", "/path", Collections.singletonMap("body", Arrays.asList("json1")))))
		.get();
        System.out.println(response);
    }

    @Test
    public void testHeadMethod() throws IOException {
        Response response = new Response().response(new Response.ResponseBuilder()
                .build(200, "OK", Collections.singletonMap("header1", "value1"), Collections.singletonMap("header2", "value2"))
                .setMethod(Method.HEAD)).get();
        System.out.println(response);
    }

    @Test
    public void testOptionsMethod() throws IOException {
        Response response = new Response().response(new Response.ResponseBuilder()
                .build(200, "OK", Collections.singletonMap("header1", "value1"), Collections.singletonMap("header2", "value2"))
                .setMethod(Method.OPTIONS)).get();
        System.out.println(response);
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

    @Test
    public void testPostWithQueryParams() throws IOException {
        String query = "param=value&foo=bar";
        URL url = new URL("https://www.example.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(Method.POST);
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(query.getBytes());
        outputStream.close();
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);
    }

    @Test
    public void testDeleteWithQueryParams() throws IOException {
        String query = "param=value&foo=bar";
        URL url = new URL("https://www.example.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(Method.DELETE);
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(query.getBytes());
        outputStream.close();
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);
    }

    @Test
    public void testPatchWithQueryParams() throws IOException {
        String query = "param=value&foo=bar";
        URL url = new URL("https://www.example.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(Method.PATCH);
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(query.getBytes());
        outputStream.close();
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);
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

    @Test
    public void testPutWithBodyAndQueryParams() throws IOException {
        String query = "param=value&foo=bar";
        URL url = new URL("https://www.example.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(Method.PUT);
        connection.setDoOutput(true);
        connection.setDoInput(true);
        outputStream = connection.getOutputStream();
        outputStream.write(query.getBytes());
        outputStream.close();
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);
    }

}