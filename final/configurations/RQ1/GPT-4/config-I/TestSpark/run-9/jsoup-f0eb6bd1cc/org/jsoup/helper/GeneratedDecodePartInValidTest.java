package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedDecodePartInValidTest {

    @Test
    public void decodePartInValidTest() {
        UrlBuilder.decodePart("%zz");
    }

}