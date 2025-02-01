package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodePartTest {

    @Test
    public void decodePartTest() {
        try {
            URL inputUrl = new URL("http://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            String encodedPart = "encodedPart";
            String result = urlBuilder.decodePart(encodedPart);
            assertTrue(result.equals(URLDecoder.decode(encodedPart, UTF_8.name()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}