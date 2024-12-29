package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

public class GeneratedBuildEmptyUrlTest {

    @Test
    public void buildEmptyUrlTest() throws MalformedURLException {
        URL url = new URL("");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        URL builtUrl = urlBuilder.build();

        assertNotNull(builtUrl);
        assertEquals("", builtUrl.toString());
    }

}