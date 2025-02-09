package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.junit.Test;
import org.junit.Assert;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildValidUrlTest {

    @Test
    public void buildValidUrlTest() throws Exception {
        // given
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // when
        URL builtUrl = builder.build();

        // then
        Assert.assertNotNull(builtUrl);
        Assert.assertEquals(inputUrl, builtUrl);
    }

}