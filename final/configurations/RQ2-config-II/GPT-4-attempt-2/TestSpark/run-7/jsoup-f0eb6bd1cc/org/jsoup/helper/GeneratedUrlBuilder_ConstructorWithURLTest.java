package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedUrlBuilder_ConstructorWithURLTest {

    @Test
    public void UrlBuilder_ConstructorWithURLTest() {
        try {
            URL url = new URL("https://www.example.com");
            UrlBuilder builder = new UrlBuilder(url);
            assertNotNull(builder);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

}