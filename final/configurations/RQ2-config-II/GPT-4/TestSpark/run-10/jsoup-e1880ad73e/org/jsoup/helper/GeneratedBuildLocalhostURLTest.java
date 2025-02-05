package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedBuildLocalhostURLTest {

    @Test
    public void buildLocalhostURLTest() {
        try {
            URL inputUrl = new URL("http://localhost");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            URL builtUrl = urlBuilder.build();
            assertEquals(inputUrl.toString(), builtUrl.toString());
        } catch (MalformedURLException ex) {
            fail("MalformedURLException thrown: " + ex.getMessage());
        }
    }

}