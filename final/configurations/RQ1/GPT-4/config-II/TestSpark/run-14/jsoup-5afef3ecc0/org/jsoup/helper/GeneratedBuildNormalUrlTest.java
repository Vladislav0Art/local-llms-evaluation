package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedBuildNormalUrlTest {

    @Test
    public void buildNormalUrlTest() throws Exception {
        URL url = new URL("https://google.com/search?q=java");
        UrlBuilder builder = new UrlBuilder(url);
        URL outputUrl = builder.build();

        assertEquals("https://google.com/search?q=java", outputUrl.toString());
    }

}