package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedDecodePartExceptionTest {

    @Test
    public void decodePartExceptionTest() throws Exception {
        UrlBuilder.class.getDeclaredMethod("decodePart", String.class)
                .invoke(new UrlBuilder(new URL("http://www.google.com")), "invalid url part \"%\"");
    }

}