package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValNonAsciiNormalizationTest {

    @Test
    public void appendKeyValNonAsciiNormalizationTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("äbc", "de\u00e4f");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        builder.appendKeyVal(kv);
        assertEquals("?%C3%A4bc%3De%C3%B6f", ((StringBuilder) builder.q).toString());
    }

}