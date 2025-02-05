package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() {
        Connection connection = new HttpConnection().userAgent("Test-Agent");
        assertNotNull(connection);
    }

}