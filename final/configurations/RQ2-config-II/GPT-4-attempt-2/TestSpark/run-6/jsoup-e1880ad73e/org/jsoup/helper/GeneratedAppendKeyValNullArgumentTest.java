package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValNullArgumentTest {

    private URL validUrl;

    @Mock
    private Connection.KeyVal keyVal;

    @Test
    public void appendKeyValNullArgumentTest() throws MalformedURLException, UnsupportedEncodingException {
        validUrl = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(validUrl);
        urlBuilder.appendKeyVal(null);
    }

}