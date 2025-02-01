package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.mockito.Mockito;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodePartUnsupportedEncodingExceptionTest {

    @Test
    public void decodePartUnsupportedEncodingExceptionTest() throws Exception {
        UrlBuilder.decodePart("\u0080");
    }

}