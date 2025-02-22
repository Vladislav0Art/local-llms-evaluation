package org.jsoup.helper;

import java.net.URL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void buildWithEmptyUrl() throws Exception {
        URL inputUrl = new URL("");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL expected = null;
        URL actual = builder.build();
        assertEquals(expected, actual);
    }

}