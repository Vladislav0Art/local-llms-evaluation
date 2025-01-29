package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        String url = "https://example.com";
        URLBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        assertEquals(url, result.getProtocol() + "://" + result.getHost() + result.getPath());
    }

}