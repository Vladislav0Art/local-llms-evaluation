package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.nio.charset.Charset;

public class GeneratedDecodePartInvalidInputTest {

    @Test
    public void decodePartInvalidInputTest() throws Exception {
        String encoded = new String(new byte[]{(byte) 0xC3, (byte) 0x28}, Charset.forName("UTF-8"));
        UrlBuilder.decodePart(encoded);
    }

}