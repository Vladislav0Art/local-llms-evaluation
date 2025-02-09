package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

import static org.junit.Assert.*;

public class GeneratedPostDataCharsetTest {

    @Test
    public void postDataCharsetTest() {
        HttpConnection instance = new HttpConnection();
        Connection result = instance.postDataCharset("ISO-8859-1");
        assertNotNull(result);
    }

}