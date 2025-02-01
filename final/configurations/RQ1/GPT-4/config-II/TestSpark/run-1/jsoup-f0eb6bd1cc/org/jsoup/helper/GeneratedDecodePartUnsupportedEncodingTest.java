package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class GeneratedDecodePartUnsupportedEncodingTest {

    @Test
    public void decodePartUnsupportedEncodingTest() throws Exception {
        UrlBuilder.class.getDeclaredMethod("decodePart", String.class)
                .invoke(null, new String(new byte[]{(byte) 0xC3, (byte) 0x28}, StandardCharsets.UTF_8));
    }

}