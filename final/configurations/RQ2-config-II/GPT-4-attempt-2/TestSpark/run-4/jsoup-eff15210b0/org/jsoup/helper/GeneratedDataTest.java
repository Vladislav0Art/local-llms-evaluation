package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDataTest {

    // testing connect(String)

    @Test
    public void dataTest() {
        String key = "key";
        String value = "value";
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data(key, value);
        Assert.assertNotNull(httpConnection);
    }

}