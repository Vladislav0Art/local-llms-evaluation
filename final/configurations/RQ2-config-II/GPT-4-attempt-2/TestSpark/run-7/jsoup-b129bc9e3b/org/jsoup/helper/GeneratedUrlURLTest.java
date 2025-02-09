package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class GeneratedUrlURLTest {

    @Test
    public void urlURLTest() {
        try {
            Assert.assertNotNull(new HttpConnection().url(new URL("http://example.com")));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}