package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

public class GeneratedDecodePartWithInvalidEncodingTest {

    @Test
    public void decodePartWithInvalidEncodingTest() throws Exception {
        String part = new String(new byte[]{(byte) 0xC3, (byte) 0x28}, "UTF-8");
        UrlBuilder.decodePart(part);
    }

}