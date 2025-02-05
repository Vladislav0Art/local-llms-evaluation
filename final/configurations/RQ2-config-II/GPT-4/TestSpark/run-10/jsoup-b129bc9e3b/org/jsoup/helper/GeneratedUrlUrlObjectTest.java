package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedUrlUrlObjectTest {

    @Test
    public void urlUrlObjectTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        connection.url(new URL("https://google.com"));
        assertNotNull(connection.request().url());
    }

}