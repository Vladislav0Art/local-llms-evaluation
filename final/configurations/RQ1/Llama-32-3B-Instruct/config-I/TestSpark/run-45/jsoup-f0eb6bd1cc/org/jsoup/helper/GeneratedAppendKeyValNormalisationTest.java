package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValNormalisationTest {

    @Test
    public void appendKeyValNormalisationTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("abc", "def");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        builder.appendKeyVal(kv);
        assertEquals("?abc=def", ((StringBuilder) builder.q).toString());
    }

}