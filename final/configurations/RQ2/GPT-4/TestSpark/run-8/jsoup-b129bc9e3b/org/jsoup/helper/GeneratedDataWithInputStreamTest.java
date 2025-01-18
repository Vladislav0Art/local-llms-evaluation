package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDataWithInputStreamTest {

    @Test
    public void dataWithInputStreamTest() {
        HttpConnection httpConnection = new HttpConnection();
        ByteArrayInputStream testStream = new ByteArrayInputStream("testData".getBytes());
        Connection connection = httpConnection.data("key", "filename", testStream);
        Assert.assertNotNull(connection);
    }

}