package org.jsoup.helper;

import org.jsoup.Connection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedHeaderTest {

    @Test
    public void headerTest() {
        Connection connection = new HttpConnection();
        connection.header("Content-Type", "application/json");
        assertEquals("application/json", connection.request().headers().get("Content-Type"));
    }

}