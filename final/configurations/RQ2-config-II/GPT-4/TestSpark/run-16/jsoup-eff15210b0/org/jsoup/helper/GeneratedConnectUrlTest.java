package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedConnectUrlTest {

    @Test
    public void connectUrlTest() {
        Connection connection = HttpConnection.connect("https://www.google.com");
        Assert.assertNotNull(connection);
    }

}