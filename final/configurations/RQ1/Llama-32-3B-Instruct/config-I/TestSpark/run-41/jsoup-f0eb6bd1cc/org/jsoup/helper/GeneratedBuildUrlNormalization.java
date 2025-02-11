package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuildUrlNormalization {

    @Test
    public void buildUrlNormalization() throws Exception {
        String urlStr = "http://example.com/äöü?abc=def#ghi";
        URL u = new URL(urlStr);
        UrlBuilder builder = new UrlBuilder(u);
        URL normU = builder.build();
        assertNotNull(normU);
        assertSame(normU.getProtocol(), u.getProtocol());
    }

}