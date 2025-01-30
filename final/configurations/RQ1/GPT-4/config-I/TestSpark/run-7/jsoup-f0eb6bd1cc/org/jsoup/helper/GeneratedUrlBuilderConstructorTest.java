package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void UrlBuilderConstructorTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com?param=value");
        UrlBuilder obj = new UrlBuilder(inputUrl);
        assertNotNull(obj);
    }

}