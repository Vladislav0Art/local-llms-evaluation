package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.URL;

public class GeneratedNewRequestTest {

    @Test
    public void newRequestTest() {
        Connection connection = new HttpConnection();
        Connection newConnection = connection.newRequest();
        assertTrue(newConnection instanceof HttpConnection);
    }

}