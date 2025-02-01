package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class GeneratedAppendToAsciiNonAsciiCharacterTest {

    @Test
    public void appendToAsciiNonAsciiCharacterTest() throws Exception {
        URL inputUrl = new URL("http://google.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        StringBuilder sb = new StringBuilder();
        builder.appendToAscii("Строка", true, sb);
        assertEquals("%D0%A1%D1%82%D1%80%D0%BE%D0%BA%D0%B0", sb.toString());
    }

}