package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.URL;

public class GeneratedResponseTest {

    @Test
    public void responseTest() {
        Connection connection = new HttpConnection();
        Connection.Response response = connection.response();
        assertNotNull(response);
    }

}