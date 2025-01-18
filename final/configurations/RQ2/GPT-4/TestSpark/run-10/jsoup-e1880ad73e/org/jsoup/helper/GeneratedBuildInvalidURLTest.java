package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildInvalidURLTest {

    @Test
    public void buildInvalidURLTest() {
        try {
            URL url = new URL("https:/google");
            UrlBuilder urlBuilder = new UrlBuilder(url);

            URL outputUrl = urlBuilder.build();

            assertNotEquals(url, outputUrl);
        } catch (Exception e) {
            fail("Exception should not have been thrown");
        }
    }

}