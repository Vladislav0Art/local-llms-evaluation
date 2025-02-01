package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.URL;
import java.net.URLEncoder;

public class GeneratedDecodePartUnsupportedEncodingExceptionTest {

    @Test
    public void decodePartUnsupportedEncodingExceptionTest() throws Exception {
        new URLBuilder(new URL("http://example.com")).decodePart("\u0000");
    }

}