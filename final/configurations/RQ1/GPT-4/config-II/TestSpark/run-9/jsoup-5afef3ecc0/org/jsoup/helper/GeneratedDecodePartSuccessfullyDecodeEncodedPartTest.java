package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.Assert;

import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedDecodePartSuccessfullyDecodeEncodedPartTest {

    @Test
    public void decodePartSuccessfullyDecodeEncodedPartTest() throws Exception {
        String encoded = URLEncoder.encode("abc", "UTF-8");
        String expected = URLDecoder.decode(encoded, "UTF-8");

        Assert.assertEquals(expected, UrlBuilder.decodePart(encoded));
    }

}