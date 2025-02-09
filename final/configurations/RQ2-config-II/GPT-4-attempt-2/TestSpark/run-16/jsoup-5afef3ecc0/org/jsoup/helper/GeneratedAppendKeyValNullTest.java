package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValNullTest {

    @Test
    public void appendKeyValNullTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        urlBuilder.appendKeyVal(null);
    }

}