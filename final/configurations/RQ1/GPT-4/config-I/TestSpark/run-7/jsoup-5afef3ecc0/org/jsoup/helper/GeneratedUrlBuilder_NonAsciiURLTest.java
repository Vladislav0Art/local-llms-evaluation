package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedUrlBuilder_NonAsciiURLTest {

    @Test
    public void UrlBuilder_NonAsciiURLTest() throws Exception {
        URL inputUrl = new URL("http://www.example.com/ñ");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputURL = urlBuilder.build();

        assertNotNull(outputURL);
        assertNotEquals(outputURL.toString(), inputUrl.toString());
    }

}