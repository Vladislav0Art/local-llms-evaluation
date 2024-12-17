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

public class GeneratedDecodePart {

    @Test
    public void decodePart() throws UnsupportedEncodingException {
        String encoded = "þäöü";
        String expectedDecoded = "thaeo%FCue";
        assertEquals(expectedDecoded, UrlBuilder.decodePart(encoded));
    }
}

}