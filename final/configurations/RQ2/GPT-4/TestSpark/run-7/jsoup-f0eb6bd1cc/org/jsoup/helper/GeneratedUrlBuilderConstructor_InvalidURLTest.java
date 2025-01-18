package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUrlBuilderConstructor_InvalidURLTest {

    @Mock
    private Connection.KeyVal keyVal;

    @Test
    public void urlBuilderConstructor_InvalidURLTest() throws MalformedURLException {
        URL url = new URL("Invalid_URL");
        new UrlBuilder(url);
    }

}