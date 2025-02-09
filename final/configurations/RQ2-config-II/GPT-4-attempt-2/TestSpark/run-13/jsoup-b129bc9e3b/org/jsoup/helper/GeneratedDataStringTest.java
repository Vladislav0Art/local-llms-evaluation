package org.jsoup.helper;

import org.jsoup.Connection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDataStringTest {

    @Test
    public void dataStringTest() {
        Connection connection = new HttpConnection();
        connection.data("key", "value");
        assertEquals("value", connection.request().data().get(0).value());
    }

}