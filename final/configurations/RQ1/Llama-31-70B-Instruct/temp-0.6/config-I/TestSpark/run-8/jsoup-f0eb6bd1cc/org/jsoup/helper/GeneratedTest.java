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
public class GeneratedTest {

    @Mock
    private URL inputUrl;

    @Test
    public void buildTest() throws MalformedURLException, URISyntaxException {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        assertNotNull(urlBuilder.q);
    }

    @Test
    public void appendToAsciiTest() throws UnsupportedEncodingException {
        String input = "space+";
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii(input, true, sb);
        assertEquals("space+", sb.toString());
    }

    @Test
    public void decodePartTest() {
        String encoded = "encoded";
        String result = UrlBuilder.decodePart(encoded);
        assertEquals(encoded, result);
    }

}