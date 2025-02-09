package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.hamcrest.core.IsEqual.equalTo;

public class GeneratedBuildWithValidUrlTest {

    @Test
    public void buildWithValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL url = urlBuilder.build();
        Assert.assertNotNull(url);
        Assert.assertThat(url, equalTo(inputUrl));
    }

}