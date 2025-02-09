package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() {
        HttpConnection connection = (HttpConnection) new HttpConnection().userAgent("Mozilla");
        assertNotNull(connection);
    }

}