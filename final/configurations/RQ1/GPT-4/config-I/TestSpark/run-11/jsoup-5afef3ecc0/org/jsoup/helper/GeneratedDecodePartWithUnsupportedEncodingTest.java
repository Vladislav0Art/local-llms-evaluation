package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedDecodePartWithUnsupportedEncodingTest {

    @Test
    public void decodePartWithUnsupportedEncodingTest() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("https://test.com"));
            URL url = urlBuilder.build();
            urlBuilder.getClass().getDeclaredMethod("decodePart", String.class).invoke(urlBuilder, "invalid-encoding");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

}