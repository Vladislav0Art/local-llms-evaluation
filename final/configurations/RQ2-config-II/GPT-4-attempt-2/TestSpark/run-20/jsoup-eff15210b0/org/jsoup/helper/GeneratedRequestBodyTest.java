package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedRequestBodyTest {

    @Test
    public void requestBodyTest() {
        HttpConnection connection = new HttpConnection();
        connection.requestBody("Request Body Test");
        assertEquals("Request Body Test", connection.request().requestBody());
    }

}