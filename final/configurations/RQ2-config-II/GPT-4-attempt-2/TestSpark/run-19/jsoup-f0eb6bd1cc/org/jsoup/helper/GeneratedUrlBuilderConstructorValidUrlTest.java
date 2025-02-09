package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.junit.Test;
import org.junit.Assert;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderConstructorValidUrlTest {

    @Test
    public void urlBuilderConstructorValidUrlTest() throws Exception {
        // given
        URL inputUrl = new URL("http://www.example.com");

        // when
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // then
        Assert.assertNotNull(builder);
    }

}