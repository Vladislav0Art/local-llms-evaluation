package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValTest_AddToExisting {

    @Test
    public void appendKeyValTest_AddToExisting() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder testInstance = new UrlBuilder(new URL("https://www.example.com/test?param=value"));
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("param2");
        when(kv.value()).thenReturn("value2");
        testInstance.appendKeyVal(kv);
        URL resultUrl = testInstance.build();
        Assert.assertEquals("https://www.example.com/test?param=value&param2=value2", resultUrl.toString());
    }

}