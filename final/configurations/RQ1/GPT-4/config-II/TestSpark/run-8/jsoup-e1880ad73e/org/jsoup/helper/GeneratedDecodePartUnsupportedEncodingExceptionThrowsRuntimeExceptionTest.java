package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedDecodePartUnsupportedEncodingExceptionThrowsRuntimeExceptionTest {

    @Test
    public void decodePartUnsupportedEncodingExceptionThrowsRuntimeExceptionTest() throws Exception {
        UrlBuilder.decodePart("\ud800");
    }

}