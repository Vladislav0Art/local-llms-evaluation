package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedUrlStringTest {

    @Test
    public void urlStringTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        connection.url(new URL("https://www.google.com"));
        Assert.assertNotNull(connection);
    }

}