package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNewRequestTest {

    @Test
    public void newRequestTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.newRequest();
        assertNotNull("New connection should not be null", newConnection);
    }

}