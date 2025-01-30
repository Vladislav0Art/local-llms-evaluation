package org.jsoup.helper;

import org.junit.Test;

import java.net.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void urlBuilderConstructorTest() throws Exception {
        URL url = new URL("https://www.example.com");
        UrlBuilder ub = new UrlBuilder(url);
        assertNotNull(ub);
    }

}