package org.jsoup.helper;

import org.jsoup.Connection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedFollowRedirectsTest {

    @Test
    public void followRedirectsTest() {
        Connection connection = new HttpConnection();
        connection.followRedirects(true);
        assertEquals(true, connection.request().followRedirects());
    }

}