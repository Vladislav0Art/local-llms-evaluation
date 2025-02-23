package org.jsoup.helper;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;

public class GeneratedTestDecodePart {

    private UrlBuilder urlBuilder;

    @Test
    public void testDecodePart() {
        String encodedPart = "encoded%20part";
        String decodedPart = urlBuilder.decodePart(encodedPart);
        assertEquals("encoded part", decodedPart);
    }

}