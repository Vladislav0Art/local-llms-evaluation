package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() {
        String userAgent = "Mozilla/5.0";
        HttpConnection conn = new HttpConnection();
        conn.userAgent(userAgent);
        assertEquals(userAgent, conn.request().header("User-Agent"));
    }

}