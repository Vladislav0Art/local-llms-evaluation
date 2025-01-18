package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValToUrlTest {

    @Test
    public void appendKeyValToUrlTest() throws Exception {
        URL testUrl = new URL("https://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);

        Connection.KeyVal mockKeyVal = mock(Connection.KeyVal.class);
        when(mockKeyVal.key()).thenReturn("q");
        when(mockKeyVal.value()).thenReturn("java+unit+test");

        urlBuilder.appendKeyVal(mockKeyVal);

        Assert.assertEquals("https://www.google.com?q=java+unit+test", URLDecoder.decode(urlBuilder.build().toString(), StandardCharsets.UTF_8.name()));
    }

}