package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.URL;

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() {
        Connection connection = new HttpConnection();
        Connection userAgentConnection = connection.userAgent("Mozilla/5.0");
        assertTrue(userAgentConnection instanceof HttpConnection);
    }

}