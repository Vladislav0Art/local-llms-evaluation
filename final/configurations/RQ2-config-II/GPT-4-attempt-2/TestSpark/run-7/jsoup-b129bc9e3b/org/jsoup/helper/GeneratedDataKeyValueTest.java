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

public class GeneratedDataKeyValueTest {

    @Test
    public void dataKeyValueTest() {
        Assert.assertNotNull(new HttpConnection().data("key", "value"));
    }

}