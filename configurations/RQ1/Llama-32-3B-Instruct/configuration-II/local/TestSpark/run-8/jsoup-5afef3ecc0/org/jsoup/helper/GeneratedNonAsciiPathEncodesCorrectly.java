package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.util.HashMap;

public class GeneratedNonAsciiPathEncodesCorrectly {

    @Test
    public void nonAsciiPathEncodesCorrectly() {
        URL inputUrl = new URL("http://example.com/path?non+ascii");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals("http://example.com/path", builder.u.getProtocol() + "://" + IDN.toASCII(builder.u.getHost()) + "/", builder.u);
    }

}