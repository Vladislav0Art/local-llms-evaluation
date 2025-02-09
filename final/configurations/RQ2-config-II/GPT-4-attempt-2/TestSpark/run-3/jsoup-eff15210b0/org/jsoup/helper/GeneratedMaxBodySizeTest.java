package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

import static org.junit.Assert.*;

public class GeneratedMaxBodySizeTest {

    @Test
    public void maxBodySizeTest() {
        HttpConnection instance = new HttpConnection();
        Connection result = instance.maxBodySize(2048);
        assertNotNull(result);
    }

}