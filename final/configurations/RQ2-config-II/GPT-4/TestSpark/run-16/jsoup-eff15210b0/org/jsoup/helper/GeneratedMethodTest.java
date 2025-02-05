package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedMethodTest {

    @Test
    public void methodTest() {
        HttpConnection connection = new HttpConnection();
        connection.method(Connection.Method.GET);
        Assert.assertNotNull(connection);
    }

}