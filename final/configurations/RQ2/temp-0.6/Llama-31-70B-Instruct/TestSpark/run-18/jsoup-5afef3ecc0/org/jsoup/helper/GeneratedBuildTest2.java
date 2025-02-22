package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildTest2 {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder();
    }

    @Test
    public void buildTest2() throws Exception {
        URL url = new URL("http://www.example.com/test.html?param1=value1&param2=value2");
        urlBuilder.setUrl(url);
        URL normalizedUrl = urlBuilder.build();
        assertNotNull(normalizedUrl);
        assertEquals("http://www.example.com/test.html?param1=value1&param2=value2", normalizedUrl.toString());
    }

}