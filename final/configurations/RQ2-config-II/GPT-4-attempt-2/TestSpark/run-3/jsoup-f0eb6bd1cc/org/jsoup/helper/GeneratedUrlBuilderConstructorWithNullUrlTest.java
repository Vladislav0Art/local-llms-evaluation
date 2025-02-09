package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.hamcrest.core.IsEqual.equalTo;

public class GeneratedUrlBuilderConstructorWithNullUrlTest {

    @Test
    public void urlBuilderConstructorWithNullUrlTest() {
        new UrlBuilder(null);
    }

}