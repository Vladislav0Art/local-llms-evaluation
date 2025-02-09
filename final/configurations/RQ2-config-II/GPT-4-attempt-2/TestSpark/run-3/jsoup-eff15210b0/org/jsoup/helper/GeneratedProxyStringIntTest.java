package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

import static org.junit.Assert.*;

public class GeneratedProxyStringIntTest {

    @Test
    public void proxyStringIntTest() {
        HttpConnection instance = new HttpConnection();
        Connection result = instance.proxy("localhost", 8888);
        assertNotNull(result);
    }

}