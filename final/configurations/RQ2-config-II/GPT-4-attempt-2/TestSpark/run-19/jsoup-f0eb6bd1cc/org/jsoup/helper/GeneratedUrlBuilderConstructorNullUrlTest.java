package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.junit.Test;
import org.junit.Assert;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedUrlBuilderConstructorNullUrlTest {

    @Test
    public void urlBuilderConstructorNullUrlTest() {
        // given
        URL inputUrl = null;

        // when
        new UrlBuilder(inputUrl);

        // then
        // should throw NullPointerException
    }

}