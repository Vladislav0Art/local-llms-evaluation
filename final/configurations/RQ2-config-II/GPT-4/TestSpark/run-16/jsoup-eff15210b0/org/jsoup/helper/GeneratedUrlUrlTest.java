package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedUrlUrlTest {

    @Test
    public void urlUrlTest() {
        HttpConnection connection = new HttpConnection();
        connection.url("https://www.google.com");
        Assert.assertNotNull(connection);
    }

}