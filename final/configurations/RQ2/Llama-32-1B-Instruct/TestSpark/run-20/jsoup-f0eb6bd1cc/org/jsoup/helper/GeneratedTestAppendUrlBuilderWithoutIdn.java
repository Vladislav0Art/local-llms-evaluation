package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestAppendUrlBuilderWithoutIdn {

    @Test
    public void testAppendUrlBuilderWithoutIdn() throws MalformedURLException {
        URLBuilder builder = new UrlBuilder("https://example.com");
        assertTrue(builder.build().getIdN() == null);
    }

}