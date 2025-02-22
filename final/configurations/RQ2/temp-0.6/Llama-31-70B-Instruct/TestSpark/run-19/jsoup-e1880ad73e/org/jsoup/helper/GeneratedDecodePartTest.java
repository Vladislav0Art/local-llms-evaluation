package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.junit.Assert.assertEquals;

public class GeneratedDecodePartTest {

    @Test
    public void decodePartTest() {
        String encoded = "http://example.com/";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals(encoded, decoded);
    }

}