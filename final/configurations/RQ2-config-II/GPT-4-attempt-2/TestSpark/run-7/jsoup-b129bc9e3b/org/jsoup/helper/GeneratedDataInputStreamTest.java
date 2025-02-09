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

public class GeneratedDataInputStreamTest {

    @Test
    public void dataInputStreamTest() {
        InputStream stream = new ByteArrayInputStream("test file content".getBytes());
        Assert.assertNotNull(new HttpConnection().data("key", "filename", stream));
    }

}