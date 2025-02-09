package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

public class GeneratedDataKeyValuesTest {

    @Test
    public void dataKeyValuesTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection result = httpConnection.data("key1", "value1", "key2", "value2");
        Assert.assertNotNull(result);
    }

}