package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.UnsupportedEncodingException;

public class GeneratedUrlBuilderConstructorNullInputTest {

    @Test
    public void urlBuilderConstructorNullInputTest() {
        new UrlBuilder(null);
    }

}