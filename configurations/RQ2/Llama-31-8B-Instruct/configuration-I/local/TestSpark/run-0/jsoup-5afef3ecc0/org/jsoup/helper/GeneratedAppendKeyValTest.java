package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        KeyVal keyVal = new KeyVal("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        verify(urlBuilder).appendKeyVal(keyVal);
    }

}