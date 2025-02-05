package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedConnectStringTest {

    @Test
    public void connectStringTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL("https://www.google.com"));
        Assert.assertNotNull(connection);
    }

}