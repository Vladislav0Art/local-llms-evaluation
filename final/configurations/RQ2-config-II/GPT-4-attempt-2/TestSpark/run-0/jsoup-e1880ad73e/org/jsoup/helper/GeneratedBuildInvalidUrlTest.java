package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildInvalidUrlTest {

    @Mock
    private Connection.KeyVal mockKeyVal;

    @Test
    public void BuildInvalidUrlTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        URL builtUrl = urlBuilder.build();
        Assert.assertNull(builtUrl);
    }

}