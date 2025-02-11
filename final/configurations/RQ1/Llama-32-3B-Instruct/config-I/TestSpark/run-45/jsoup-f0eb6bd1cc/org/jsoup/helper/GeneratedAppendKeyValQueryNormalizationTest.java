package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValQueryNormalizationTest {

    @Test
    public void appendKeyValQueryNormalizationTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("abc?", "def");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        builder.appendKeyVal(kv);
        assertEquals("?%3Aabc%3Fdef", ((StringBuilder) builder.q).toString());
    }

}