package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.HttpStatusException;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedDataTest {

    @Test
    public void dataTest() {
        Connection connection = new HttpConnection();
        String key = "key";
        String value = "value";
        connection.data(key, value);
        String actualKey = null;
        String actualValue = null;

        for (Connection.KeyVal kv : connection.request().data()) {
            if (kv.key().equals(key)) {
                actualKey = kv.key();
                actualValue = kv.value();
                break;
            }
        }
        Assert.assertEquals(key, actualKey);
        Assert.assertEquals(value, actualValue);
    }

}