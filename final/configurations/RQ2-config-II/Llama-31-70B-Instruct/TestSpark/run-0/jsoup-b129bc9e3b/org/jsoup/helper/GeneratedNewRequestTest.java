package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedNewRequestTest {

    @Test
    public void newRequestTest() {
        HttpConnection connection = new HttpConnection();
        HttpConnection newConnection = connection.newRequest();
        assertEquals(connection.request(), newConnection.request());
    }

}