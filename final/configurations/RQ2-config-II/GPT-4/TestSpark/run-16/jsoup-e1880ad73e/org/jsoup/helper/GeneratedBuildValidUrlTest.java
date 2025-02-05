package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedBuildValidUrlTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void buildValidUrlTest() {
        URL url = null;

        try {
            url = new URL("http://www.example.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();

        assertEquals(url, result);
    }

}