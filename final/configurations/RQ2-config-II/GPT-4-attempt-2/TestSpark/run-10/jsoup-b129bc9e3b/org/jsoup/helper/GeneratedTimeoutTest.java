package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedTimeoutTest {

    @Test
    public void timeoutTest() {
        HttpConnection connection = (HttpConnection) new HttpConnection().timeout(5000);
        assertNotNull(connection);
    }

}