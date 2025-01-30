package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrlWithNonAsciiCharactersTest {

    @Test
    public void buildUrlWithNonAsciiCharactersTest() throws MalformedURLException {
        URL url = new URL("http://example.com/öäüß汉字");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL newUrl = urlBuilder.build();
        assertEquals("http://example.com/%C3%B6%C3%A4%C3%BC%C3%9F%E6%B1%89%E5%AD%97", newUrl.toString());
    }

}