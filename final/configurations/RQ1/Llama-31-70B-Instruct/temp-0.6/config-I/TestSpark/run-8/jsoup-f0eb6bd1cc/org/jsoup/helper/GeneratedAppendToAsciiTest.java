package org.jsoup.helper;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendToAsciiTest {

    @Mock
    private URL inputUrl;

    @Test
    public void appendToAsciiTest() throws UnsupportedEncodingException {
        String input = "space+";
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii(input, true, sb);
        assertEquals("space+", sb.toString());
    }

}