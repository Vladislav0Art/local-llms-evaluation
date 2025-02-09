package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedTimeoutTest {

    @Test
    public void timeoutTest() {
        HttpConnection connection = new HttpConnection();
        connection.timeout(3000);
        assertEquals(3000, connection.request().timeout());
    }

}