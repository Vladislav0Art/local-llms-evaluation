package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() {
        HttpConnection httpConnection = new HttpConnection();
        String userAgent = "Mozilla/5.0";
        assertEquals(userAgent, httpConnection.userAgent(userAgent).request().header("User-Agent"));
    }

}