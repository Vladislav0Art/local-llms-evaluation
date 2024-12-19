package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.util.HashMap;

public class GeneratedRefEncodesCorrectly {

    @Test
    public void refEncodesCorrectly() {
        URL inputUrl = new URL("http://example.com#ref");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals("#%20ref", builder.u.getRef());
    }

}