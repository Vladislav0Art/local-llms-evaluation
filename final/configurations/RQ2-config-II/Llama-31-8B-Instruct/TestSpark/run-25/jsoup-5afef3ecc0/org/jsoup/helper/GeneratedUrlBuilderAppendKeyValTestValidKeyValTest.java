package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUrlBuilderAppendKeyValTestValidKeyValTest {

    @Test
    public void urlBuilderAppendKeyValTestValidKeyValTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        String expectedUrl = "https://www.example.com?key=value";
        assertEquals(expectedUrl, urlBuilder.build().toString());
    }

}