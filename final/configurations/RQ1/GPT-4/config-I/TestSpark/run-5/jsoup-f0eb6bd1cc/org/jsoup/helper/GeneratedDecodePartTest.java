package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodePartTest {

    @Test
    public void decodePartTest() throws Exception {
        final String encoded = "\uC881";

        UrlBuilder.decodePart(encoded);
    }

}