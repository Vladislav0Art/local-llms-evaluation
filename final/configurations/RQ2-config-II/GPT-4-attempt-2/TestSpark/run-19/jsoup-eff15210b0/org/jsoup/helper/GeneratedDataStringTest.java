package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDataStringTest {

    @Test
    public void dataStringTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.data("key", "value");
        assertEquals("value", connection.request().data().get(0).value());
    }

}