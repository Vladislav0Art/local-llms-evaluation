package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testBuild() {
        URL inputUrl = null; // TODO: Initialize
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        // TODO: Add assertions
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        Connection.KeyVal kv = null; // TODO: Initialize
        urlBuilder.appendKeyVal(kv);
        // TODO: Add assertions
    }

    @Test
    public void testDecodePart() {
        String encoded = ""; // TODO: Initialize
        String result = UrlBuilder.decodePart(encoded);
        // TODO: Add assertions
    }

    @Test
    public void testAppendToAscii() throws UnsupportedEncodingException {
        String s = ""; // TODO: Initialize
        boolean spaceAsPlus = false; // TODO: Initialize
        StringBuilder sb = null; // TODO: Initialize
        UrlBuilder.appendToAscii(s, spaceAsPlus, sb);
        // TODO: Add assertions
    }

}