package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.util.HashMap;

public class GeneratedPunyCodeHostBuildsCorrectly {

    @Test
    public void punyCodeHostBuildsCorrectly() {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals("http://example.com", builder.u.getProtocol() + "://" + IDN.toASCII(builder.u.getHost()) + "/", builder.u);
    }

}