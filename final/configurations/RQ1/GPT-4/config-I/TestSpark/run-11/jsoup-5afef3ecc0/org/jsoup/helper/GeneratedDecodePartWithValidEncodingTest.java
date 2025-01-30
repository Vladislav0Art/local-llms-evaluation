package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedDecodePartWithValidEncodingTest {

    @Test
    public void decodePartWithValidEncodingTest() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("https://test.com"));
            URL url = urlBuilder.build();
            String decodedString = (String) urlBuilder.getClass().getDeclaredMethod("decodePart", String.class)
                    .invoke(urlBuilder, "valid+encoding");
            assertEquals("valid encoding", decodedString);
        } catch (Exception e) {
            fail("This test should not raise an exception");
        }
    }

}