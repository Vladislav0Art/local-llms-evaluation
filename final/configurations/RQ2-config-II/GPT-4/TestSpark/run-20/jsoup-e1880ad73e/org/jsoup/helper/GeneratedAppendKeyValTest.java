package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("mockKey");
        Mockito.when(keyVal.value()).thenReturn("mockVal");
        urlBuilder.appendKeyVal(keyVal);
        URL builtUrl = urlBuilder.build();
        Assert.assertEquals(inputUrl.toString() + "?mockKey=mockVal", URLDecoder.decode(builtUrl.toString(), "UTF-8"));
    }

}