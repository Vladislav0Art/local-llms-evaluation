package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedDecode_part_encoding_test {

    @Test
    public void decode_part_encoding_test() throws UnsupportedEncodingException {
        String encoded = "http%3A//example.com/path";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals("http://example.com/path", decoded);
    }

}