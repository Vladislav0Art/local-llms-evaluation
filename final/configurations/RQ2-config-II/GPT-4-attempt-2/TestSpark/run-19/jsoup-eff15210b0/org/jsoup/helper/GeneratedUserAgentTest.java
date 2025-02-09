package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() {
        HttpConnection connection = new HttpConnection();
        String agent = "Mozilla";
        Connection result = connection.userAgent(agent);
        assertEquals(agent, result.request().userAgent());
    }

}