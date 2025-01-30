package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderBuildURLWithUnicodeCharactersTest {

    @Test
    public void urlBuilderBuildURLWithUnicodeCharactersTest() throws Exception {
        URL inputUrl = new URL("http://google.com/ø?ø=Ø");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();

        assertEquals("http://google.com/%C3%B8?%C3%B8=%C3%98", resultUrl.toString());
    }

}