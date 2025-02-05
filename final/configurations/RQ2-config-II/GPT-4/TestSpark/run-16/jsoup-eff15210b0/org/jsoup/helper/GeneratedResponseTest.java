package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedResponseTest {

    @Test
    public void responseTest() {
        HttpConnection connection = new HttpConnection();
        Connection.Response mockResponse = mock(Connection.Response.class);
        connection.response(mockResponse);
        Assert.assertNotNull(connection.response());
    }

}