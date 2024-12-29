package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDataWithKeyFilenameInputStreamTest {

    @Test
    public void dataWithKeyFilenameInputStreamTest() {
        HttpConnection connection = new HttpConnection();
        ByteArrayInputStream stream = new ByteArrayInputStream(new byte[10]);
        Assert.assertEquals(connection, connection.data("key", "test", stream));
    }

}