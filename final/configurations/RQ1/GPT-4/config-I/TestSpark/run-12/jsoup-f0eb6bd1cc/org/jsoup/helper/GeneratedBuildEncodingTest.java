package org.jsoup.helper;

import org.junit.Test;

import java.net.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedBuildEncodingTest {

    @Test
    public void buildEncodingTest() throws Exception {
        URL url = new URL("https://www.example.com/äöü");
        UrlBuilder ub = new UrlBuilder(url);
        URL result = ub.build();
        assertEquals(result.toString(), "https://www.example.com/%C3%A4%C3%B6%C3%BC");
    }

}