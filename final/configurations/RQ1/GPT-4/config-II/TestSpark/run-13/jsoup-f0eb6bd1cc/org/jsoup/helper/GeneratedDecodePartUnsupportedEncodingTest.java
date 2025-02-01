package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.URL;
import java.net.URLEncoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodePartUnsupportedEncodingTest {

    @Test
    public void decodePartUnsupportedEncodingTest() throws Exception {
        URL urlWithUnsupportedEncoding = new URL("http://www.example.com/ÆØÅ");
        UrlBuilder urlBuilder = new UrlBuilder(urlWithUnsupportedEncoding);

        urlBuilder.build();
    }

}