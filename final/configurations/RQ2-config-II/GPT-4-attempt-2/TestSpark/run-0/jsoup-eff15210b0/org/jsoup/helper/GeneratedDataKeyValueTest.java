package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

public class GeneratedDataKeyValueTest {

    @Test
    public void dataKeyValueTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection result = httpConnection.data("key1", "value1");
        Assert.assertNotNull(result);
    }

}