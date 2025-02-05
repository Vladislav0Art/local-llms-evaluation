package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedDataKeyStringTest {

    @Test
    public void dataKeyStringTest() {
        HttpConnection connection = new HttpConnection();
        connection.data("key", "value");
        Assert.assertNotNull(connection);
    }

}