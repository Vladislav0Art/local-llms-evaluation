package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;
import org.junit.Test;

import java.net.URL;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructorTest() throws Exception {
        URL inputUrl = new URL("http://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        assertEquals(inputUrl, urlBuilder.u);
    }

    @Test
    public void urlBuilderBuildTest() throws Exception {
        URL inputUrl = new URL("http://google.com/search?q=test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();

        assertEquals("http://google.com/search?q=test", resultUrl.toString());
    }

    @Test
    public void urlBuilderBuildURLWithReferenceTest() throws Exception {
        URL inputUrl = new URL("http://google.com/search?q=test#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();

        assertEquals("http://google.com/search?q=test#anchor", resultUrl.toString());
    }

    @Test
    public void urlBuilderBuildURLWithUnicodeCharactersTest() throws Exception {
        URL inputUrl = new URL("http://google.com/ø?ø=Ø");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();

        assertEquals("http://google.com/%C3%B8?%C3%B8=%C3%98", resultUrl.toString());
    }

    @Test
    public void urlBuilderDecodePart() throws Exception {
        String encoded = "%C3%B8";
        Method method = UrlBuilder.class.getDeclaredMethod("decodePart", String.class);
        method.setAccessible(true);

        String result = (String) method.invoke(null, encoded);

        assertEquals("ø", result);
    }

    @Test
    public void urlBuilderAppendToAscii() throws Exception {
        String stringToEncode = "æøæ";
        boolean spaceAsPlus = true;
        StringBuilder sb = new StringBuilder();
        Method method = UrlBuilder.class.getDeclaredMethod("appendToAscii", String.class, boolean.class, StringBuilder.class);
        method.setAccessible(true);
        method.invoke(null, stringToEncode, spaceAsPlus, sb);

        assertEquals("%C3%A6%C3%B8%C3%A6", sb.toString());
    }

}