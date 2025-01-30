package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedBuild_NormalURLTest {

    @Test
    public void build_NormalURLTest() throws Exception {
        URL inputUrl = new URL("http://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputURL = urlBuilder.build();
        assertNotNull(outputURL);
        assertEquals("http://google.com", outputURL.toString());
    }

}