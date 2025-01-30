package org.jsoup.helper;

import org.junit.Test;

import java.net.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedBuildBasicTest {

    @Test
    public void buildBasicTest() throws Exception {
        URL url = new URL("https://www.example.com");
        UrlBuilder ub = new UrlBuilder(url);
        URL result = ub.build();
        assertEquals(result.toString(), "https://www.example.com");
    }

}