package org.jsoup.helper;

import org.junit.Test;

import java.net.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedDecodePartExceptionTest {

    @Test
    public void decodePartExceptionTest() throws Exception {
        URL url = new URL("https://www.example.com/äöü");
        UrlBuilder ub = new UrlBuilder(url);
        ub.build();
    }

}