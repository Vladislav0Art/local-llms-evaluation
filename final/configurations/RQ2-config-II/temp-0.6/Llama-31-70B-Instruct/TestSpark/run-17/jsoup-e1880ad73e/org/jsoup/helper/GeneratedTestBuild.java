package org.jsoup.helper;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

public class GeneratedTestBuild {

    @Test
    public void testBuild() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com/test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL url = urlBuilder.build();
        assertEquals("https://www.example.com/test", url.toString());
    }

}