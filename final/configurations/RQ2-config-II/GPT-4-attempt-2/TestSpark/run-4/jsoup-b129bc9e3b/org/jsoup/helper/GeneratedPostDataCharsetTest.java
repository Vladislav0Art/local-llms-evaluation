package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

public class GeneratedPostDataCharsetTest {

    @Test
    public void postDataCharsetTest() {
        String charset = "UTF-8";
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.postDataCharset(charset);
        Assert.assertEquals(charset, ((HttpConnection) connection).request().postDataCharset());
    }

}