package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValTest_whenValueIsNull {


    @Mock
    private Connection.KeyVal keyVal;

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void appendKeyValTest_whenValueIsNull() throws UnsupportedEncodingException {
        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn(null);
        urlBuilder.appendKeyVal(keyVal);
        URL result = urlBuilder.build();
        assertEquals(new URL("http://www.example.com"), result);
    }

}