package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

import static org.junit.Assert.*;

public class GeneratedHttpConnectionCopyConstructorTest {

    @Test
    public void HttpConnectionCopyConstructorTest() {
        HttpConnection original = new HttpConnection();
        HttpConnection result = new HttpConnection(original.request());
        assertNotNull(result);
    }

}