package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(JUnit4.class)
public class GeneratedDecodePartEncoding {

    @Test
    public void decodePartEncoding() throws UnsupportedEncodingException {
        String decoded = UrlBuilder.decodePart("%C3%A9xample.com");
        assertEquals("examp1e.co.uk", decoded);
    }

}