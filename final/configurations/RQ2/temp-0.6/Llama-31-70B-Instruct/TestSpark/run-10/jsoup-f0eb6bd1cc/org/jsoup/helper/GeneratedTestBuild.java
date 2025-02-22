package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GeneratedTestBuild {

    @Test
    public void testBuild() throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com/path/to/file?foo=bar#baz");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL builtUrl = urlBuilder.build();

        assertEquals("https://www.example.com/path/to/file?foo=bar#baz", builtUrl.toString());
    }

}