package org.jsoup.helper;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildWithNonAsciiCharactersTest {

    @Test
    public void buildWithNonAsciiCharactersTest() throws MalformedURLException {
        URL url = new URL("http://example.com/öäüß汉字");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL newUrl = urlBuilder.build();
        assertEquals("http://example.com/%C3%B6%C3%A4%C3%BC%C3%9F%E6%B1%89%E5%AD%97", newUrl.toString());
    }

}